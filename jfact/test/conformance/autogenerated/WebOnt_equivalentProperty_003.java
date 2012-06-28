package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_equivalentProperty_003 {
    @Test
    public void testWebOnt_equivalentProperty_003() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentProperty/premises003\" >\n"
                + "   <owl:Ontology/>\n"
                + "   <owl:ObjectProperty rdf:about=\"conclusions003#hasHead\">\n"
                + "      <rdfs:subPropertyOf rdf:resource=\"conclusions003#hasLeader\"/>\n"
                + "   </owl:ObjectProperty>\n"
                + "   <owl:ObjectProperty rdf:about=\"conclusions003#hasLeader\">\n"
                + "      <rdfs:subPropertyOf rdf:resource=\"conclusions003#hasHead\"/>\n"
                + "   </owl:ObjectProperty>\n" + "</rdf:RDF>";
        String conclusion = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentProperty/conclusions003\" >\n"
                + "   <owl:Ontology/>\n" + "   <owl:ObjectProperty rdf:ID=\"hasHead\">\n"
                + "      <owl:equivalentProperty>\n"
                + "         <owl:ObjectProperty rdf:ID=\"hasLeader\"/>\n"
                + "      </owl:equivalentProperty>\n" + "   </owl:ObjectProperty>\n"
                + "</rdf:RDF>";
        String id = "WebOnt_equivalentProperty_003";
        TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
        String d = "The inverse entailment of test 002 also holds.";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
