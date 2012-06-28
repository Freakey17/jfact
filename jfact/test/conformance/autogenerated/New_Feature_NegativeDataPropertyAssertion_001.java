package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class New_Feature_NegativeDataPropertyAssertion_001 {
    @Test
    public void testNew_Feature_NegativeDataPropertyAssertion_001() {
        String premise = "<?xml version=\"1.0\"?>\n"
                + "<rdf:RDF\n"
                + "  xml:base  = \"http://example.org/\"\n"
                + "  xmlns     = \"http://example.org/\"\n"
                + "  xmlns:owl = \"http://www.w3.org/2002/07/owl#\"\n"
                + "  xmlns:rdf = \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
                + "\n"
                + "<owl:Ontology/>\n"
                + "\n"
                + "<owl:DatatypeProperty rdf:about=\"hasAge\" />\n"
                + "\n"
                + "<owl:NegativePropertyAssertion>\n"
                + "  <owl:sourceIndividual rdf:resource=\"Meg\" />\n"
                + "  <owl:assertionProperty rdf:resource=\"hasAge\" />\n"
                + "  <owl:targetValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">5</owl:targetValue>\n"
                + "</owl:NegativePropertyAssertion>\n"
                + "\n"
                + "<rdf:Description rdf:about=\"Meg\">\n"
                + "  <hasAge rdf:datatype=\"http://www.w3.org/2001/XMLSchema#integer\">5</hasAge>\n"
                + "</rdf:Description>\n" + "\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "New_Feature_NegativeDataPropertyAssertion_001";
        TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
        String d = "Demonstrates use of a negative data property assertion to create a trivial inconsistency based on an example in the Structural Specification and Functional-Style Syntax document.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
