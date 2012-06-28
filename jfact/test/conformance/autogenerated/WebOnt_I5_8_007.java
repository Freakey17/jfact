package conformance.autogenerated;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import conformance.Factory;

public class WebOnt_I5_8_007 {
    @Test
    public void testWebOnt_I5_8_007() throws OWLOntologyCreationException {
        //		String premise = "<rdf:RDF\n"
        //				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
        //				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
        //				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
        //				+ "    xml:base=\"http://www.w3.org/2002/03owlt/I5.8/premises007\" >\n"
        //				+ "  <owl:Ontology/>\n"
        //				+ "  <owl:DatatypeProperty rdf:ID=\"p\">\n"
        //				+ "    <rdfs:range rdf:resource=\n"
        //				+ "  \"http://www.w3.org/2001/XMLSchema#short\" />\n"
        //				+ "  </owl:DatatypeProperty>\n" + "</rdf:RDF>";
        //		String conclusion = "<rdf:RDF\n"
        //				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
        //				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
        //				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
        //				+ "    xml:base=\"http://www.w3.org/2002/03owlt/I5.8/nonconclusions007\" >\n"
        //				+ "  <owl:Ontology/>\n"
        //				+ "  <owl:DatatypeProperty rdf:about=\"premises007#p\">\n"
        //				+ "    <rdfs:range rdf:resource=\n"
        //				+ "  \"http://www.w3.org/2001/XMLSchema#unsignedByte\" />\n"
        //				+ "  </owl:DatatypeProperty>\n" + "\n" + "</rdf:RDF>";
        //		String id = "WebOnt_I5_8_007";
        //		TestClasses tc = TestClasses.valueOf("NEGATIVE_IMPL");
        //		String d = "-1 is an <code>xsd:short</code>\n" + "that is not an\n"
        //				+ " <code>xsd:unsignedByte</code>.";
        //		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        //		r.setReasonerFactory(Factory.factory());
        //		r.run();
        //
        OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        OWLDataFactory f = m.getOWLDataFactory();
        OWLOntology o = m.createOntology();
        final OWLDataProperty p = f.getOWLDataProperty(IRI.create("urn:p"));
        m.addAxiom(
                o,
                f.getOWLDataPropertyRangeAxiom(p,
                        f.getOWLDatatype(OWL2Datatype.XSD_SHORT.getIRI())));
        OWLReasoner r = Factory.factory().createReasoner(o);
        assertFalse(
                "unsigned byte should not be inferred",
                r.isEntailed(f.getOWLDataPropertyRangeAxiom(p,
                        f.getOWLDatatype(OWL2Datatype.XSD_UNSIGNED_BYTE.getIRI()))));
    }
}
