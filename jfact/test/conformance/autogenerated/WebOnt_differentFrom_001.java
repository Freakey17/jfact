package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_differentFrom_001 {
    @Test
    public void testWebOnt_differentFrom_001() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:first=\"http://www.w3.org/2002/03owlt/differentFrom/premises001#\"\n"
                + "    xmlns:second=\"http://www.w3.org/2002/03owlt/differentFrom/conclusions001#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/differentFrom/premises001\" >\n"
                + "\n" + "    <owl:Ontology/>\n"
                + "    <rdf:Description rdf:about=\"premises001#a\">\n"
                + "        <owl:differentFrom rdf:resource=\"premises001#b\"/>\n"
                + "    </rdf:Description>\n" + "\n" + "</rdf:RDF>";
        String conclusion = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:first=\"http://www.w3.org/2002/03owlt/differentFrom/premises001#\"\n"
                + "    xmlns:second=\"http://www.w3.org/2002/03owlt/differentFrom/conclusions001#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/differentFrom/conclusions001\" >\n"
                + "\n" + "    <owl:Ontology/>\n"
                + "    <rdf:Description rdf:about=\"premises001#b\">\n"
                + "        <owl:differentFrom rdf:resource=\"premises001#a\"/>\n"
                + "    </rdf:Description>\n" + "\n" + "</rdf:RDF>";
        String id = "WebOnt_differentFrom_001";
        TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
        String d = "<code>differentFrom</code> is a <code>SymmetricProperty</code>.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
