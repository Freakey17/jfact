package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_035 {
    @Test
    public void testWebOnt_description_logic_035() {
        String premise = "<rdf:RDF \n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" \n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent035\"\n"
                + "    xmlns:oiled=\"http://oiled.man.example.net/test#\">\n"
                + "\n"
                + "<owl:Ontology rdf:about=\"\">\n"
                + "  <rdfs:comment>An ontology illustrating the use of a spy point that\n"
                + "limits the cardinality of the interpretation domain to having only two\n"
                + "objects.</rdfs:comment> \n"
                + "</owl:Ontology>\n"
                + "\n"
                + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n"
                + " <rdfs:subClassOf>\n"
                + "  <owl:Restriction>\n"
                + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n"
                + "    <owl:minCardinality\n"
                + "rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">3</owl:minCardinality>\n"
                + "  </owl:Restriction>\n"
                + " </rdfs:subClassOf>\n"
                + "</owl:Class>\n"
                + "\n"
                + "<owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#p\">\n"
                + " <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#invP\"/>\n"
                + "</owl:ObjectProperty>\n"
                + "<owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n"
                + "\n"
                + "<owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invP\"/>\n"
                + "\n"
                + "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\">\n"
                + " <rdfs:subClassOf> \n"
                + "  <owl:Restriction>\n"
                + "   <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#p\"/>\n"
                + "   <owl:someValuesFrom>\n"
                + "    <owl:Class>\n"
                + "     <owl:oneOf rdf:parseType=\"Collection\">\n"
                + "      <owl:Thing rdf:about=\"http://oiled.man.example.net/test#spy\"/>\n"
                + "     </owl:oneOf>\n"
                + "    </owl:Class>\n"
                + "   </owl:someValuesFrom>\n"
                + "  </owl:Restriction>\n"
                + " </rdfs:subClassOf>\n"
                + "</owl:Class>\n"
                + "\n"
                + "<rdf:Description rdf:about=\"http://oiled.man.example.net/test#spy\">\n"
                + "  <rdf:type>\n"
                + "   <owl:Restriction>\n"
                + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#invP\"/>\n"
                + "    <owl:maxCardinality\n"
                + "rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:maxCardinality>\n"
                + "  </owl:Restriction>\n" + " </rdf:type>\n" + "</rdf:Description>\n"
                + "\n" + "<oiled:Unsatisfiable/>\n" + "\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "WebOnt_description_logic_035";
        TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
        String d = "A test for the interaction of one-of and inverse using the idea of a spy point.\n"
                + "Everything is related to the spy via the property p and we know that the spy \n"
                + "has at most two invP successors, thus limiting the cardinality of the domain \n"
                + "to being at most 2.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
