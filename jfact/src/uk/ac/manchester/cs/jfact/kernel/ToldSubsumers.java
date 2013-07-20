package uk.ac.manchester.cs.jfact.kernel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
    /** class to represent the TS's */
   public class ToldSubsumers extends KnownSubsumers {
        /** two iterators for the TS of a concept */
        List<ClassifiableEntry> beg;

        public ToldSubsumers(Collection<ClassifiableEntry> b) {
            beg = new ArrayList<ClassifiableEntry>(b);
        }

        /** begin of the Sure subsumers interval */
        @Override
        List<ClassifiableEntry> s_begin() {
            return beg;
        }

        /** end of the Sure subsumers interval */
        /** begin of the Possible subsumers interval */
        @Override
        List<ClassifiableEntry> p_begin() {
            return Collections.emptyList();
        }
    }