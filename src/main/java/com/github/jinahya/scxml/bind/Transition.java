/*
 * Copyright 2015 Jin Kwon &lt;jinahya_at_gmail.com&gt;.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jinahya.scxml.bind;

import java.util.List;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;

/**
 *
 * @author Jin Kwon &lt;jinahya_at_gmail.com&gt;
 */
public class Transition {

    @XmlEnum
    public static enum TransitionType {

        @XmlEnumValue("internal")
        INTERNAL,
        @XmlEnumValue("external")
        EXTERNAL
    }

    @XmlAttribute
    @XmlList
    private List<String> event;

    @XmlAttribute
    private String cond = Boolean.TRUE.toString();

    @XmlAttribute
    @XmlIDREF
    @XmlList
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> target;

    @XmlAttribute
    private TransitionType type = TransitionType.EXTERNAL;

    @XmlElementRefs({
        @XmlElementRef(name = "assign", namespace = XmlConstants.SCXML_NS_URI, type = Assign.class),
        @XmlElementRef(name = "cancel", namespace = XmlConstants.SCXML_NS_URI, type = Cancel.class, required = false),
        @XmlElementRef(name = "if", namespace = XmlConstants.SCXML_NS_URI, type = If.class, required = false),
        @XmlElementRef(name = "foreach", namespace = XmlConstants.SCXML_NS_URI, type = Foreach.class, required = false),
        @XmlElementRef(name = "log", namespace = XmlConstants.SCXML_NS_URI, type = Log.class, required = false),
        @XmlElementRef(name = "raise", namespace = XmlConstants.SCXML_NS_URI, type = Raise.class, required = false),
        @XmlElementRef(name = "script", namespace = XmlConstants.SCXML_NS_URI, type = Script.class, required = false),
        @XmlElementRef(name = "send", namespace = XmlConstants.SCXML_NS_URI, type = Send.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> executables;

}
