package com.github.jinahya.scxml.bind.etc;

import org.junit.jupiter.api.Test;
import org.w3._2005._07.scxml.ScxmlScxmlType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.URL;

public class XletScxmlTest {

    // -----------------------------------------------------------------------------------------------------------------
    @Test
    public void unmarshal() throws JAXBException, IOException {
        final JAXBContext context = JAXBContext.newInstance(ScxmlScxmlType.class);
        final Unmarshaller unmarshaller = context.createUnmarshaller();
        final URL resource = XletScxmlTest.class.getResource("xlet.scxml");
        final ScxmlScxmlType unmarshalled = ((JAXBElement<ScxmlScxmlType>) unmarshaller.unmarshal(resource)).getValue();
    }
}
