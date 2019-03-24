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

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * @author Jin Kwon &lt;jinahya_at_gmail.com&gt;
 */
public class State {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    @XmlAttribute(name = "initial")
    @XmlIDREF
    @XmlList
    @XmlSchemaType(name = "IDREFS")
    protected List<State> initial_;

    @XmlElement
    private List<Onentry> onentry;

    @XmlElement
    private List<Onexit> onexit;

    @XmlElement
    private List<Transition> transition;

    @XmlElement
    private Initial initial;

    @XmlElement
    private List<State> state;

    @XmlElement
    private List<State> parallel;

    @XmlElement(name = "final")
    private List<Final> final_;

    @XmlElement
    private List<History> history;

    @XmlElement
    private Datamodel datamode;

    @XmlElement
    private List<Invoke> invoke;
}
