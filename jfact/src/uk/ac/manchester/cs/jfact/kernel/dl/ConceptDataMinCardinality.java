package uk.ac.manchester.cs.jfact.kernel.dl;

/* This file is part of the JFact DL reasoner
 Copyright 2011 by Ignazio Palmisano, Dmitry Tsarkov, University of Manchester
 This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version. 
 This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA*/
import uk.ac.manchester.cs.jfact.kernel.dl.interfaces.ConceptDataCardinalityExpression;
import uk.ac.manchester.cs.jfact.kernel.dl.interfaces.DataExpression;
import uk.ac.manchester.cs.jfact.kernel.dl.interfaces.DataRoleArg;
import uk.ac.manchester.cs.jfact.kernel.dl.interfaces.DataRoleExpression;
import uk.ac.manchester.cs.jfact.visitors.DLExpressionVisitor;
import uk.ac.manchester.cs.jfact.visitors.DLExpressionVisitorEx;
import conformance.PortedFrom;

@PortedFrom(file="tDLExpression.h",name="TDLConceptDataMinCardinality")
public class ConceptDataMinCardinality implements ConceptDataCardinalityExpression,
        DataRoleArg {
    /** data role argument */
    private DataRoleExpression dataRoleExpression;
    private int delegate;
    private DataExpression delegateExpression;

    public ConceptDataMinCardinality(int n, DataRoleExpression R, DataExpression E) {
        dataRoleExpression = R;
        delegateExpression = E;
        delegate = n;
    }

    @Override
    public void accept(DLExpressionVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <O> O accept(DLExpressionVisitorEx<O> visitor) {
        return visitor.visit(this);
    }

    @Override
    public int getCardinality() {
        return delegate;
    }

    /** get access to the argument */
    @Override
    public DataRoleExpression getDataRoleExpression() {
        return dataRoleExpression;
    }

    @Override
    public DataExpression getExpr() {
        return delegateExpression;
    }
}
