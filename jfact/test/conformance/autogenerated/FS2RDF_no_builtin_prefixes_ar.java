package conformance.autogenerated;

import org.junit.Test;

import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class FS2RDF_no_builtin_prefixes_ar {
    @Test
    public void testFS2RDF_no_builtin_prefixes_ar() {
        String premise = "<rdf:RDF\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
                + "    xmlns=\"http://example.org/\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
                + "  <owl:Ontology/>\n"
                + "  <rdf:Description rdf:about=\"http://example.org/d\">\n"
                + "    <owl:sameAs rdf:resource=\"http://example.org/e\"/>\n"
                + "  </rdf:Description>\n"
                + "  <rdf:Description rdf:about=\"http://example.org/a\">\n"
                + "    <owl:sameAs>\n"
                + "      <rdf:Description rdf:about=\"http://example.org/b\">\n"
                + "        <owl:sameAs>\n"
                + "          <rdf:Description rdf:about=\"http://example.org/c\">\n"
                + "            <owl:sameAs rdf:resource=\"http://example.org/d\"/>\n"
                + "          </rdf:Description>\n" + "        </owl:sameAs>\n"
                + "      </rdf:Description>\n" + "    </owl:sameAs>\n"
                + "  </rdf:Description>\n" + "</rdf:RDF>";
        String conclusion = "";
        String id = "FS2RDF_no_builtin_prefixes_ar";
        TestClasses tc = TestClasses.valueOf("CONSISTENCY");
        String d = "Functional syntax to RDFXML checking that there aren't builtin prefixes for xsd, rdf, rdfs, owl";
        JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
        r.setReasonerFactory(Factory.factory());
        r.run();
    }
}
