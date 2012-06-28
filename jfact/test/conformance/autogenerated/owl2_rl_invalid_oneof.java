package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class owl2_rl_invalid_oneof {
    @Test
    public void testowl2_rl_invalid_oneof() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
                + "  <owl:Ontology />\n"
                + "  <owl:Class rdf:about=\"http://owl2.test/rules#Cb\">\n"
                + "    <owl:oneOf rdf:parseType=\"Collection\">\n"
                + "      <owl:Thing rdf:about=\"http://owl2.test/rules#X\"/>\n"
                + "      <owl:Thing rdf:about=\"http://owl2.test/rules#Y\"/>\n"
                + "    </owl:oneOf>\n" + "  </owl:Class>\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "owl2_rl_invalid_oneof";
        TestClasses tc = TestClasses.valueOf("CONSISTENCY");
        String d = "OWL 2 RL does not permit owl:oneOf to define a named class (it can be used as a subclass expression).";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
