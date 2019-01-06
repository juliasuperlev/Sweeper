package com.itvdn.patterns.factory_method;

import javax.swing.text.Document;
import java.io.File;

public class FactoryMethod {
    public AbstractWriter getWriter(Object object) {
        if (object instanceof File) {
            return new ConcreteFileWriter();
        } else if (object instanceof Document) {
            return new ConcreteXmlWriter();
        } else return null; //   ???
    }
}
