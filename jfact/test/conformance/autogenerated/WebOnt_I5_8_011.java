package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_I5_8_011 {
    @Test
    public void testWebOnt_I5_8_011() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
                + "  <owl:Ontology/>\n" + "</rdf:RDF>";
        String conclusion = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/I5.8/conclusions011\" >\n"
                + "\n"
                + "  <owl:Ontology/>\n"
                + "  <rdfs:Datatype rdf:about=\"http://www.w3.org/2001/XMLSchema#integer\"/>\n"
                + "  <rdfs:Datatype rdf:about=\"http://www.w3.org/2001/XMLSchema#string\"/>\n"
                + "</rdf:RDF>";
        String id = "WebOnt_I5_8_011";
        TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
        String d = "The empty graph entails that <code>xsd:integer</code> and <code>xsd:string</code>\n"
                + "are a <code>rdfs:Datatype</code>";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
