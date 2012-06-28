package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_I5_3_008 {
    @Test
    public void testWebOnt_I5_3_008() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:first=\"http://www.w3.org/2002/03owlt/I5.3/consistent008#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/I5.3/consistent008\" >\n"
                + "    <owl:Ontology/>\n" + "    <owl:Thing>\n"
                + "      <first:dp>value</first:dp>\n" + "    </owl:Thing>\n"
                + "    <owl:DatatypeProperty rdf:ID=\"dp\" />\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "WebOnt_I5_3_008";
        TestClasses tc = TestClasses.valueOf("CONSISTENCY");
        String d = "An OWL Lite version of <a xmlns=\"http://www.w3.org/1999/xhtml\" href=\"#I5.3-007\">test 007</a>.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
