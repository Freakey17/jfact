package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_Restriction_002 {
    @Test
    public void testWebOnt_Restriction_002() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/Restriction/inconsistent002\" >\n"
                + "   <owl:Ontology/>\n" + "   <owl:ObjectProperty rdf:ID=\"op\"/>\n"
                + "   <rdf:Description rdf:ID=\"a\">\n" + "     <rdf:type>\n"
                + "        <owl:Restriction rdf:nodeID=\"r\">\n"
                + "           <owl:onProperty rdf:resource=\"#op\"/>\n"
                + "           <owl:someValuesFrom rdf:resource=\n"
                + "     \"http://www.w3.org/2002/07/owl#Nothing\" />\n"
                + "        </owl:Restriction>\n" + "     </rdf:type>\n"
                + "   </rdf:Description>\n" + "   <rdf:Description rdf:ID=\"b\">\n"
                + "     <rdf:type rdf:nodeID=\"r\"/>\n" + "   </rdf:Description>\n"
                + "               \n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "WebOnt_Restriction_002";
        TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
        String d = "This test shows syntax that was not permitted in OWL Lite or OWL DL for using the same restriction twice, but is permitted in OWL 2 DL.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
