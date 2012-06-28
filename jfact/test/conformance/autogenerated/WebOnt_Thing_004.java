package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_Thing_004 {
    @Test
    public void testWebOnt_Thing_004() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/Thing/consistent004\" >\n"
                + "\n" + "  <owl:Ontology/>\n"
                + "  <owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\">\n"
                + "        <owl:oneOf rdf:parseType=\"Collection\">\n"
                + "            <owl:Thing rdf:about=\"#s\"/>\n"
                + "        </owl:oneOf>\n" + "  </owl:Class>\n" + "\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "WebOnt_Thing_004";
        TestClasses tc = TestClasses.valueOf("CONSISTENCY");
        String d = "The extension of OWL Thing may be a singleton in OWL DL.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
