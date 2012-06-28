package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class FS2RDF_different_individuals_3_ar {
    @Test
    public void testFS2RDF_different_individuals_3_ar() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "    xmlns=\"http://example.org/\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
                + "  <owl:Ontology/>\n" + "  <owl:AllDifferent>\n"
                + "    <owl:distinctMembers rdf:parseType=\"Collection\">\n"
                + "      <rdf:Description rdf:about=\"http://example.org/a\"/>\n"
                + "      <rdf:Description rdf:about=\"http://example.org/b\"/>\n"
                + "      <rdf:Description rdf:about=\"http://example.org/c\"/>\n"
                + "    </owl:distinctMembers>\n" + "  </owl:AllDifferent>\n"
                + "</rdf:RDF>";
        String conclusion = "";
        String id = "FS2RDF_different_individuals_3_ar";
        TestClasses tc = TestClasses.valueOf("CONSISTENCY");
        String d = "Functional syntax to RDFXML translation of ontology consisting of a 3 argument DifferentIndividuals";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
