package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_Thing_003 {
    @Test
    public void testWebOnt_Thing_003() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/Thing/inconsistent003\" >\n"
                + "\n" + "  <owl:Ontology/>\n"
                + "  <owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\">\n"
                + "    <owl:equivalentClass rdf:resource\n"
                + "       =\"http://www.w3.org/2002/07/owl#Nothing\"/>\n"
                + "  </owl:Class>\n" + "\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "WebOnt_Thing_003";
        TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
        String d = "The extension of OWL Thing may not be empty.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
