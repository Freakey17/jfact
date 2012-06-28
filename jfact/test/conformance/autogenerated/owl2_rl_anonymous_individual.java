package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class owl2_rl_anonymous_individual {
    @Test
    public void testowl2_rl_anonymous_individual() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:j.0=\"http://owl2.test/rules#\">\n" + "  <owl:Ontology />\n"
                + "  <owl:ObjectProperty rdf:about=\"http://owl2.test/rules#op\"/>\n"
                + "  <owl:NamedIndividual rdf:about=\"http://owl2.test/rules#I\"/>\n"
                + "  <owl:NamedIndividual>\n"
                + "    <j.0:op rdf:resource=\"http://owl2.test/rules#I\"/>\n"
                + "  </owl:NamedIndividual>\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "owl2_rl_anonymous_individual";
        TestClasses tc = TestClasses.valueOf("CONSISTENCY");
        String d = "OWL 2 RL allows anonymous individual.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
