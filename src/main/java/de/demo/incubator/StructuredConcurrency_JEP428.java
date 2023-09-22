package de.demo.incubator;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.Subtask;

public class StructuredConcurrency_JEP428 {

	static Response handle(Long userId) throws InterruptedException, ExecutionException {

		try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

			Subtask<String> userFuture = scope.fork(() -> findUser(userId));

			Subtask<Integer> orderFuture = scope.fork(() -> fetchOrder(userId));

			scope.join();
			scope.throwIfFailed();

			return new Response(userFuture.get(), orderFuture.get());

		}

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("start");

		System.out.println("sync" + handle(Long.valueOf(23456)));

		System.out.println("end");
	}

	private static String findUser(Long userId) {
		return "Laura";
	}

	private static Integer fetchOrder(Long userId) {
		return 23456;
	}

}

record Response(String Username, Integer orderNr) {
}