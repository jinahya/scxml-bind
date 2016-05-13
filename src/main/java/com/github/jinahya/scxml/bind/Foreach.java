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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jin Kwon &lt;jinahya_at_gmail.com&gt;
 */
@XmlRootElement
public class Foreach extends Executable {

    @XmlAttribute(required = true)
    private String array;

    @XmlAttribute(required = true)
    private String item;

    @XmlAttribute(required = true)
    private String index;

    @XmlElements({
        @XmlElement(name = "assign", namespace = "http://www.w3.org/2005/07/scxml", type = Assign.class, required = false),
        @XmlElement(name = "cancel", namespace = "http://www.w3.org/2005/07/scxml", type = Cancel.class, required = false),
        @XmlElement(name = "foreach", namespace = "http://www.w3.org/2005/07/scxml", type = Foreach.class, required = false),
        @XmlElement(name = "if", namespace = "http://www.w3.org/2005/07/scxml", type = If.class, required = false),
        @XmlElement(name = "log", namespace = "http://www.w3.org/2005/07/scxml", type = Log.class, required = false),
        @XmlElement(name = "raise", namespace = "http://www.w3.org/2005/07/scxml", type = Raise.class, required = false),
        @XmlElement(name = "script", namespace = "http://www.w3.org/2005/07/scxml", type = Script.class, required = false),
        @XmlElement(name = "send", namespace = "http://www.w3.org/2005/07/scxml", type = Send.class, required = false)
    })
    private List<Executable> executables;

}
