package uk.ac.manchester.cs.jfact.split;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import uk.ac.manchester.cs.jfact.kernel.dl.interfaces.AxiomInterface;
import conformance.Original;
import conformance.PortedFrom;

/** ontology atom */
@PortedFrom(file = "tOntologyAtom.h", name = "TOntologyAtom")
public class TOntologyAtom {
    @Original
    static Comparator<TOntologyAtom> comparator = new Comparator<TOntologyAtom>() {
        @Override
        public int compare(TOntologyAtom arg0, TOntologyAtom arg1) {
            return arg0.getId() - arg1.getId();
        }
    };
    /** set of axioms in the atom */
    @PortedFrom(file = "tOntologyAtom.h", name = "AtomAxioms")
    Set<AxiomInterface> AtomAxioms = new HashSet<AxiomInterface>();
    /** set of axioms in the module (Atom's ideal) */
    @PortedFrom(file = "tOntologyAtom.h", name = "ModuleAxioms")
    Set<AxiomInterface> ModuleAxioms = new HashSet<AxiomInterface>();
    /** set of atoms current one depends on */
    @PortedFrom(file = "tOntologyAtom.h", name = "DepAtoms")
    Set<TOntologyAtom> DepAtoms = new HashSet<TOntologyAtom>();
    /** set of all atoms current one depends on */
    @PortedFrom(file = "tOntologyAtom.h", name = "AllDepAtoms")
    Set<TOntologyAtom> AllDepAtoms = new HashSet<TOntologyAtom>();
    /** unique atom's identifier */
    @PortedFrom(file = "tOntologyAtom.h", name = "Id")
    int Id = 0;

    /** remove all atoms in AllDepAtoms from DepAtoms */
    @PortedFrom(file = "tOntologyAtom.h", name = "filterDep")
    public void filterDep() {
        for (TOntologyAtom p : AllDepAtoms) {
            DepAtoms.remove(p);
        }
    }

    /** build all dep atoms; filter them from DepAtoms
     * 
     * @param checked */
    @PortedFrom(file = "tOntologyAtom.h", name = "buildAllDepAtoms")
    public void buildAllDepAtoms(Set<TOntologyAtom> checked) {
        // first gather all dep atoms from all known dep atoms
        for (TOntologyAtom p : DepAtoms) {
            Set<TOntologyAtom> Dep = p.getAllDepAtoms(checked);
            AllDepAtoms.addAll(Dep);
        }
        // now filter them out from known dep atoms
        filterDep();
        // add direct deps to all deps
        AllDepAtoms.addAll(DepAtoms);
        // now the atom is checked
        checked.add(this);
    }

    // fill in the sets
    /** set the module axioms
     * 
     * @param module */
    @PortedFrom(file = "tOntologyAtom.h", name = "setModule")
    public void setModule(Collection<AxiomInterface> module) {
        ModuleAxioms = new HashSet<AxiomInterface>(module);
    }

    /** add axiom AX to an atom
     * 
     * @param ax */
    @PortedFrom(file = "tOntologyAtom.h", name = "addAxiom")
    public void addAxiom(AxiomInterface ax) {
        AtomAxioms.add(ax);
        ax.setAtom(this);
    }

    /** add atom to the dependency set
     * 
     * @param atom */
    @PortedFrom(file = "tOntologyAtom.h", name = "addDepAtom")
    public void addDepAtom(TOntologyAtom atom) {
        if (atom != null && atom != this) {
            DepAtoms.add(atom);
        }
    }

    /** @param checked
     * @return all the atoms the current one depends on; build this set if
     *         necessary */
    @PortedFrom(file = "tOntologyAtom.h", name = "getAllDepAtoms")
    public Set<TOntologyAtom> getAllDepAtoms(Set<TOntologyAtom> checked) {
        if (checked.contains(this)) {
            buildAllDepAtoms(checked);
        }
        return AllDepAtoms;
    }

    // access to axioms
    /** @return all the atom's axioms */
    @PortedFrom(file = "tOntologyAtom.h", name = "getAtomAxioms")
    public Set<AxiomInterface> getAtomAxioms() {
        return AtomAxioms;
    }

    /** @return all the module axioms */
    @PortedFrom(file = "tOntologyAtom.h", name = "getModule")
    public Set<AxiomInterface> getModule() {
        return ModuleAxioms;
    }

    /** @return atoms a given one depends on */
    @PortedFrom(file = "tOntologyAtom.h", name = "getDepAtoms")
    public Set<TOntologyAtom> getDepAtoms() {
        return DepAtoms;
    }

    /** @return the value of the id */
    @PortedFrom(file = "tOntologyAtom.h", name = "getId")
    public int getId() {
        return Id;
    }

    /** set the value of the id to ID
     * 
     * @param id */
    @PortedFrom(file = "tOntologyAtom.h", name = "setId")
    public void setId(int id) {
        Id = id;
    }
}
