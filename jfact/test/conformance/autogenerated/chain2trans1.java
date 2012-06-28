package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class chain2trans1 {
    @Test
    public void testchain2trans1() {
        String premise = "<rdf:RDF \n"
                + "     xml:base=\"http://example.org/\"\n"
                + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
                + "\n"
                + "    <owl:Ontology rdf:about=\"http://owl.semanticweb.org/page/Special:GetOntology/Chain2trans?m=p\"/>\n"
                + "    <owl:ObjectProperty rdf:about=\"#p\"/>\n" + "\n"
                + "    <rdf:Description rdf:about=\"#p\">\n"
                + "        <owl:propertyChainAxiom rdf:parseType=\"Collection\">\n"
                + "            <rdf:Description rdf:about=\"#p\"/>\n"
                + "            <rdf:Description rdf:about=\"#p\"/>\n"
                + "        </owl:propertyChainAxiom>\n" + "    </rdf:Description>\n"
                + "</rdf:RDF>";
        String conclusion = "<?xml version=\"1.0\"?>\n"
                + "<rdf:RDF \n"
                + "     xml:base=\"http://example.org/\"\n"
                + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
                + "    <owl:Ontology rdf:about=\"http://owl.semanticweb.org/page/Special:GetOntology/Chain2trans?m=c\"/>\n"
                + "    <owl:TransitiveProperty rdf:about=\"#p\"/>\n" + "</rdf:RDF>";
        String id = "chain2trans1";
        TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
        String d = "A role chain can be a synonym for transitivity.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
