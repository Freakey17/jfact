package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class owl2_rl_valid_oneof {
    @Test
    public void testowl2_rl_valid_oneof() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
                + "  <owl:Ontology />\n"
                + "  <owl:Class rdf:about=\"http://owl2.test/rules#Cb\"/>\n"
                + "  <owl:NamedIndividual rdf:about=\"http://owl2.test/rules#X\"/>\n"
                + "  <owl:NamedIndividual rdf:about=\"http://owl2.test/rules#Y\"/>\n"
                + "  <rdf:Description>\n"
                + "    <rdfs:subClassOf rdf:resource=\"http://owl2.test/rules#Cb\"/>\n"
                + "    <owl:oneOf rdf:parseType=\"Collection\">\n"
                + "      <owl:NamedIndividual rdf:about=\"http://owl2.test/rules#X\"/>\n"
                + "      <owl:NamedIndividual rdf:about=\"http://owl2.test/rules#Y\"/>\n"
                + "    </owl:oneOf>\n" + "  </rdf:Description>\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "owl2_rl_valid_oneof";
        TestClasses tc = TestClasses.valueOf("CONSISTENCY");
        String d = "A valid usage of oneOf in OWL 2 RL";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
