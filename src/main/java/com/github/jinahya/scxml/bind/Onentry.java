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


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;


/**
 *
 * @author Jin Kwon &lt;jinahya_at_gmail.com&gt;
 */
public class Onentry {


    public List<Executable> getExecutables() {

        if (executables == null) {
            executables = new ArrayList<Executable>();
        }

        return executables;
    }


    @XmlElements({
        @XmlElement(name = "log", namespace = XmlConstants.SCXML_NS_URI, type = Log.class, required = false),
        @XmlElement(name = "script", namespace = XmlConstants.SCXML_NS_URI, type = Script.class, required = false),
        @XmlElement(name = "raise", namespace = XmlConstants.SCXML_NS_URI, type = Raise.class, required = false),
        @XmlElement(name = "foreach", namespace = XmlConstants.SCXML_NS_URI, type = Foreach.class, required = false),
        @XmlElement(name = "assign", namespace = XmlConstants.SCXML_NS_URI, type = Assign.class, required = false),
        @XmlElement(name = "if", namespace = XmlConstants.SCXML_NS_URI, type = If.class, required = false),
        @XmlElement(name = "cancel", namespace = XmlConstants.SCXML_NS_URI, type = Cancel.class, required = false),
        @XmlElement(name = "send", namespace = XmlConstants.SCXML_NS_URI, type = Send.class, required = false)
    })
    protected List<Executable> executables;

}

