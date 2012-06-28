package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_207 {
    @Test
    public void testWebOnt_description_logic_207() {
        String premise = "<rdf:RDF\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/premises207\"\n"
                + "    xmlns:oiled=\"http://oiled.man.example.net/test#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n"
                + "    <owl:Ontology rdf:about=\"\"/>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10\">\n"
                + "        <owl:equivalentClass>\n"
                + "            <owl:Class>\n"
                + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n"
                + "                </owl:intersectionOf>\n"
                + "            </owl:Class>\n"
                + "        </owl:equivalentClass>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C12\">\n"
                + "        <owl:equivalentClass>\n"
                + "            <owl:Restriction>\n"
                + "                <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n"
                + "                <owl:someValuesFrom>\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10\"/>\n"
                + "                </owl:someValuesFrom>\n"
                + "            </owl:Restriction>\n"
                + "        </owl:equivalentClass>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C6\">\n"
                + "        <owl:equivalentClass>\n"
                + "            <owl:Class>\n"
                + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "                    <owl:Class>\n"
                + "                        <owl:complementOf>\n"
                + "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n"
                + "                        </owl:complementOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n"
                + "                </owl:intersectionOf>\n"
                + "            </owl:Class>\n"
                + "        </owl:equivalentClass>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C8\">\n"
                + "        <owl:equivalentClass>\n"
                + "            <owl:Restriction>\n"
                + "                <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n"
                + "                <owl:someValuesFrom>\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C6\"/>\n"
                + "                </owl:someValuesFrom>\n"
                + "            </owl:Restriction>\n"
                + "        </owl:equivalentClass>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#TEST\">\n"
                + "        <owl:equivalentClass>\n"
                + "            <owl:Class>\n"
                + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "                    <owl:Class>\n"
                + "                        <owl:complementOf>\n"
                + "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#C8\"/>\n"
                + "                        </owl:complementOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C12\"/>\n"
                + "                </owl:intersectionOf>\n"
                + "            </owl:Class>\n"
                + "        </owl:equivalentClass>\n"
                + "    </owl:Class>\n"
                + "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#R1\"/>\n"
                + "    <owl:Thing rdf:about=\"http://oiled.man.example.net/test#V21080\">\n"
                + "        <rdf:type>\n"
                + "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#TEST\"/>\n"
                + "        </rdf:type>\n"
                + "        <rdf:type>\n"
                + "            <owl:Class>\n"
                + "                <owl:complementOf>\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C8\"/>\n"
                + "                </owl:complementOf>\n"
                + "            </owl:Class>\n"
                + "        </rdf:type>\n"
                + "        <rdf:type>\n"
                + "            <owl:Restriction>\n"
                + "                <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n"
                + "                <owl:allValuesFrom>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:complementOf>\n"
                + "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#C6\"/>\n"
                + "                        </owl:complementOf>\n"
                + "                    </owl:Class>\n"
                + "                </owl:allValuesFrom>\n"
                + "            </owl:Restriction>\n"
                + "        </rdf:type>\n"
                + "        <oiled:R1 rdf:resource=\"http://oiled.man.example.net/test#V21081\"/>\n"
                + "    </owl:Thing>\n"
                + "    <owl:Thing rdf:about=\"http://oiled.man.example.net/test#V21081\">\n"
                + "        <rdf:type>\n"
                + "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n"
                + "        </rdf:type>\n"
                + "        <rdf:type>\n"
                + "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n"
                + "        </rdf:type>\n"
                + "        <rdf:type>\n"
                + "            <owl:Class>\n"
                + "                <owl:complementOf>\n"
                + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#C6\"/>\n"
                + "                </owl:complementOf>\n" + "            </owl:Class>\n"
                + "        </rdf:type>\n" + "    </owl:Thing>\n" + "</rdf:RDF>";
        String conclusion = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "      xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "      xml:base=\"http://www.w3.org/2002/03owlt/description-logic/conclusions207\"\n"
                + ">\n"
                + "<owl:Ontology/>\n"
                + "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V21080\">\n"
                + "  <rdf:type>\n"
                + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C12\"/>\n"
                + "</rdf:type>\n"
                + "</owl:Thing>\n"
                + "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V21081\">\n"
                + "  <rdf:type>\n"
                + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C10\"/>\n"
                + "</rdf:type>\n" + "</owl:Thing>\n" + "</rdf:RDF>";
        String id = "WebOnt_description_logic_207";
        TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
        String d = "DL Test: k_ph\n" + "ABox test from DL98 systems comparison.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
