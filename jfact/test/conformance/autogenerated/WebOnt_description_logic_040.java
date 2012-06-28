package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_040 {
    @Test
    public void testWebOnt_description_logic_040() {
        String premise = "<rdf:RDF xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:eg=\"http://example.org/factkb#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" \n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent040\"\n"
                + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n"
                + "    <owl:Ontology rdf:about=\"\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A0\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A1\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A2\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A3\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A4\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A5\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A6\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A7\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A8\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A9\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B0\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B1\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B2\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B3\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B4\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B5\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B6\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B7\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B8\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B9\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#C1\">\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Class>\n"
                + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A0\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B0\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A1\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B1\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A2\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B2\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A3\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B3\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A4\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B4\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A5\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B5\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A6\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B6\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A7\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B7\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A8\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B8\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A9\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B9\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A10\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B10\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A11\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B11\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A12\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B12\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A13\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B13\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A14\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B14\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A15\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B15\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A16\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B16\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A17\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B17\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A18\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B18\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A19\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B19\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A20\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B20\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A21\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B21\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A22\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B22\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A23\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B23\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A24\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B24\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A25\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B25\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A26\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B26\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A27\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B27\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A28\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B28\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A29\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B29\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A30\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B30\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A31\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B31\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                </owl:intersectionOf>\n"
                + "            </owl:Class>\n"
                + "        </rdfs:subClassOf>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#C2\">\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Class>\n"
                + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A\"/>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#A\"/>\n"
                + "                            <owl:Class>\n"
                + "                                <owl:complementOf>\n"
                + "                                    <owl:Class rdf:about=\"http://example.org/factkb#B\"/>\n"
                + "                                </owl:complementOf>\n"
                + "                            </owl:Class>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                </owl:intersectionOf>\n"
                + "            </owl:Class>\n"
                + "        </rdfs:subClassOf>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#C3\">\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Class>\n"
                + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class>\n"
                + "                                <owl:complementOf>\n"
                + "                                    <owl:Class rdf:about=\"http://example.org/factkb#A\"/>\n"
                + "                                </owl:complementOf>\n"
                + "                            </owl:Class>\n"
                + "                            <owl:Class rdf:about=\"http://example.org/factkb#B\"/>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                    <owl:Class>\n"
                + "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
                + "                            <owl:Class>\n"
                + "                                <owl:complementOf>\n"
                + "                                    <owl:Class rdf:about=\"http://example.org/factkb#A\"/>\n"
                + "                                </owl:complementOf>\n"
                + "                            </owl:Class>\n"
                + "                            <owl:Class>\n"
                + "                                <owl:complementOf>\n"
                + "                                    <owl:Class rdf:about=\"http://example.org/factkb#B\"/>\n"
                + "                                </owl:complementOf>\n"
                + "                            </owl:Class>\n"
                + "                        </owl:unionOf>\n"
                + "                    </owl:Class>\n"
                + "                </owl:intersectionOf>\n"
                + "            </owl:Class>\n"
                + "        </rdfs:subClassOf>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#C4\">\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Restriction>\n"
                + "                <owl:onProperty rdf:resource=\"http://example.org/factkb#R\"/>\n"
                + "                <owl:someValuesFrom>\n"
                + "                    <owl:Class rdf:about=\"http://example.org/factkb#C2\"/>\n"
                + "                </owl:someValuesFrom>\n"
                + "            </owl:Restriction>\n"
                + "        </rdfs:subClassOf>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#C5\">\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Restriction>\n"
                + "                <owl:onProperty rdf:resource=\"http://example.org/factkb#R\"/>\n"
                + "                <owl:allValuesFrom>\n"
                + "                    <owl:Class rdf:about=\"http://example.org/factkb#C3\"/>\n"
                + "                </owl:allValuesFrom>\n"
                + "            </owl:Restriction>\n"
                + "        </rdfs:subClassOf>\n"
                + "    </owl:Class>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A10\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A11\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A12\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A13\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A14\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A15\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A16\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A17\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A18\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A19\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A20\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A21\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A22\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A23\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A24\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A25\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A26\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A27\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A28\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A29\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A30\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#A31\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B10\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B11\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B12\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B13\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B14\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B15\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B16\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B17\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B18\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B19\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B20\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B21\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B22\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B23\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B24\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B25\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B26\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B27\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B28\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B29\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B30\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#B31\"/>\n"
                + "    <owl:Class rdf:about=\"http://example.org/factkb#TEST\">\n"
                + "        <rdfs:subClassOf>\n"
                + "            <owl:Class>\n"
                + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "                    <owl:Class rdf:about=\"http://example.org/factkb#C1\"/>\n"
                + "                    <owl:Class rdf:about=\"http://example.org/factkb#C4\"/>\n"
                + "                    <owl:Class rdf:about=\"http://example.org/factkb#C5\"/>\n"
                + "                </owl:intersectionOf>\n"
                + "            </owl:Class>\n" + "        </rdfs:subClassOf>\n"
                + "    </owl:Class>\n"
                + "    <owl:ObjectProperty rdf:about=\"http://example.org/factkb#R\"/>\n"
                + "    <eg:TEST/>\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "WebOnt_description_logic_040";
        TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
        String d = "This kind of pattern comes up a lot in more complex ontologies. \n"
                + "Failure to cope with this kind of pattern is one\n"
                + "of the reasons that many reasoners have been unable to \n"
                + "cope with such ontologies.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
