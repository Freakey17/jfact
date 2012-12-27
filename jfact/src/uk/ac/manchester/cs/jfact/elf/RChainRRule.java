package uk.ac.manchester.cs.jfact.elf;

import java.util.Set;

import conformance.PortedFrom;

/** the rule for S in R o S [= T case */
@PortedFrom(file = "ELFReasoner.h", name = "RChainRRule")
public class RChainRRule extends TELFRule {
    /** role to check the chain */
    TELFRole R;
    /** role to add the pair */
    TELFRole T;

    /** init c'tor: remember R and T */
    RChainRRule(ELFReasoner ER, TELFRole r, TELFRole t) {
        super(ER);
        R = r;
        T = t;
    }

    /** apply a method with a given pair (C,D) */
    @Override
    @PortedFrom(file = "ELFReasoner.h", name = "apply")
    void apply(TELFConcept addedC, TELFConcept addedD) {
        // we have S(C,D); so for all E in domain(R), if R(E,C) then add
        // T(E,D)
        Set<TELFConcept> SupSet = R.getPredSet(addedC);
        if (!SupSet.isEmpty()) {
            for (TELFConcept p : SupSet) {
                // if ( !T.hasLabel ( *p, addedD ) )
                ER.addAction(new ELFAction(T, p, addedD));
            }
        }
    }
}