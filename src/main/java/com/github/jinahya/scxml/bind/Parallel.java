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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


public class Parallel {


    @XmlAttribute
    @XmlID
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "ID")
    protected String id;


    @XmlElement(name = "onentry")
    private List<Onentry> onentries;


    @XmlElement(name = "onexit")
    private List<Onexit> onexits;


    @XmlElement(name = "transition")
    private List<Transition> transitions;


    @XmlElement(name = "state")
    private List<State> states;


    @XmlElement(name = "parallel")
    private List<Parallel> parallels;


    @XmlElement(name = "history")
    private List<History> histories;


    @XmlElement
    private Datamodel datamodel;


    @XmlElement(name = "invoke")
    private List<Invoke> invokes;

}

