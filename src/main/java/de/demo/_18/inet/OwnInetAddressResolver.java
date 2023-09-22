package de.demo._18.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;
import java.util.stream.Stream;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das 
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class OwnInetAddressResolver implements InetAddressResolver
{
    @Override
    public Stream<InetAddress> lookupByName(String host, LookupPolicy lookupPolicy) throws UnknownHostException
    {
        if (host.equals("www.dpunkt.de"))
            return Stream.of(InetAddress.getByAddress(new byte[] { 127, 0, 0, 1 }));

        throw new UnsupportedOperationException();
    }

    @Override
    public String lookupByAddress(byte[] addr)
    {
        throw new UnsupportedOperationException();
    }
}