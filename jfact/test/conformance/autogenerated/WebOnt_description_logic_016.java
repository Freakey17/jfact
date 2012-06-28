package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_016 {
    @Test
    public void testWebOnt_description_logic_016() {
        String premise = "<rdf:RDF\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/consistent016\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n"
                + "    <owl:Ontology rdf:about=\"\"/>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#Satisfiable\">\n"
                + "        <owl:equivalentClass>\n"
                + "            <owl:Class>\n"
                + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "                    <owl:Restriction>\n"
                + "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#f1\"/>\n"
                + "                        <owl:someValuesFrom>\n"
                + "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#p1\"/>\n"
                + "                        </owl:someValuesFrom>\n"
                + "                    </owl:Restriction>\n"
                + "                    <owl:Restriction>\n"
                + "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#f2\"/>\n"
                + "                        <owl:someValuesFrom>\n"
                + "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#p2\"/>\n"
                + "                        </owl:someValuesFrom>\n"
                + "                    </owl:Restriction>\n"
                + "                </owl:intersectionOf>\n"
                + "            </owl:Class>\n"
                + "        </owl:equivalentClass>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#p1\">\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Class>\n"
                + "                <owl:complementOf>\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#p2\"/>\n"
                + "                </owl:complementOf>\n"
                + "            </owl:Class>\n"
                + "        </rdfs:subClassOf>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#p2\"/>\n"
                + "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\">\n"
                + "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#f2\"/>\n"
                + "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#f1\"/>\n"
                + "    </owl:ObjectProperty>\n"
                + "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f1\"/>\n"
                + "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f2\"/>\n"
                + "<rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing' >\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Restriction>\n"
                + "                <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#f1\"/>\n"
                + "                <owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality>\n"
                + "            </owl:Restriction>\n"
                + "        </rdfs:subClassOf>\n"
                + "</rdf:Description>\n"
                + "<rdf:Description rdf:about='http://www.w3.org/2002/07/owl#Thing' >\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Restriction>\n"
                + "                <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#f2\"/>\n"
                + "                <owl:maxCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:maxCardinality>\n"
                + "            </owl:Restriction>\n"
                + "        </rdfs:subClassOf>\n"
                + "</rdf:Description>\n"
                + "    <rdf:Description>\n"
                + "        <rdf:type rdf:resource=\"http://oiled.man.example.net/test#Satisfiable\"/>\n"
                + "    </rdf:Description>\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "WebOnt_description_logic_016";
        TestClasses tc = TestClasses.valueOf("CONSISTENCY");
        String d = "DL Test: t2.1";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
