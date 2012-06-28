package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_642 {
    @Test
    public void testWebOnt_description_logic_642() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:oiled=\"http://oiled.man.example.net/test#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + " xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent642\">\n"
                + " <owl:Ontology rdf:about=\"\"/>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#e3\">\n"
                + "  <rdfs:subClassOf>\n"
                + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n"
                + "  </rdfs:subClassOf>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#c1\">\n"
                + "  <rdfs:subClassOf>\n"
                + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#d1\"/>\n"
                + "  </rdfs:subClassOf>\n"
                + "  <rdfs:subClassOf>\n"
                + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#d1.comp\"/>\n"
                + "  </rdfs:subClassOf>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:ID=\"A.3\">\n"
                + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n"
                + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n"
                + "  </owl:intersectionOf>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#d1\">\n"
                + "  <owl:equivalentClass>\n"
                + "   <owl:Restriction>\n"
                + "    <owl:onProperty>\n"
                + "     <owl:ObjectProperty rdf:ID=\"P.2\"/>\n"
                + "    </owl:onProperty>\n"
                + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n"
                + "    >1</owl:minCardinality>\n"
                + "   </owl:Restriction>\n"
                + "  </owl:equivalentClass>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#d.comp\">\n"
                + "  <owl:equivalentClass>\n"
                + "   <owl:Restriction>\n"
                + "    <owl:onProperty>\n"
                + "     <owl:DatatypeProperty rdf:ID=\"P.1\"/>\n"
                + "    </owl:onProperty>\n"
                + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n"
                + "    >1</owl:minCardinality>\n"
                + "   </owl:Restriction>\n"
                + "  </owl:equivalentClass>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#f\">\n"
                + "  <rdfs:subClassOf>\n"
                + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n"
                + "  </rdfs:subClassOf>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n"
                + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
                + "   <owl:Restriction>\n"
                + "    <owl:onProperty>\n"
                + "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n"
                + "    </owl:onProperty>\n"
                + "    <owl:allValuesFrom rdf:resource=\"#A.3\"/>\n"
                + "   </owl:Restriction>\n"
                + "   <owl:Restriction>\n"
                + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n"
                + "    <owl:someValuesFrom>\n"
                + "     <owl:Class rdf:about=\"/2002/07/owl#Thing\"/>\n"
                + "    </owl:someValuesFrom>\n"
                + "   </owl:Restriction>\n"
                + "  </owl:intersectionOf>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\">\n"
                + "  <owl:equivalentClass>\n"
                + "   <owl:Restriction>\n"
                + "    <owl:onProperty rdf:resource=\"#P.1\"/>\n"
                + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n"
                + "    >0</owl:maxCardinality>\n"
                + "   </owl:Restriction>\n"
                + "  </owl:equivalentClass>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\">\n"
                + "  <rdfs:subClassOf rdf:resource=\"http://oiled.man.example.net/test#d.comp\"/>\n"
                + " </owl:Class>\n"
                + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#d1.comp\">\n"
                + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
                + "    <owl:onProperty rdf:resource=\"#P.2\"/>\n"
                + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n"
                + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n"
                + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
                + " <oiled:Unsatisfiable/>\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "WebOnt_description_logic_642";
        TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
        String d = "DL Test: heinsohn1.2\n" + "Tbox tests from Heinsohn et al.\n" + "\n"
                + "Tests incoherency caused by disjoint concept";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
