package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class rdfbased_sem_eqdis_disclass_inst {
    @Test
    public void testrdfbased_sem_eqdis_disclass_inst() {
        //XXX test modified because of ontology not compliant with OWL 2
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "    xmlns:ex=\"http://www.example.org#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
                //added
                + "<owl:Class rdf:about=\"http://www.example.org#c2\"/>\n"
                + "<owl:Class rdf:about=\"http://www.example.org#c1\"/>\n"
                //end added
                + "  <ex:c1 rdf:about=\"http://www.example.org#w\">\n"
                + "    <rdf:type rdf:resource=\"http://www.example.org#c2\"/>\n"
                + "  </ex:c1>\n"
                + "  <rdf:Description rdf:about=\"http://www.example.org#c1\">\n"
                + "    <owl:disjointWith rdf:resource=\"http://www.example.org#c2\"/>\n"
                + "  </rdf:Description>\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "rdfbased_sem_eqdis_disclass_inst";
        TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
        String d = "Individuals being instances of disjoint classes are different from each other.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
