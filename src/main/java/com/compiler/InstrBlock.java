package com.compiler;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.ListIterator;

public class InstrBlock {
	private ArrayList<InstrIntf> m_instrList;
	private String m_name;

	public InstrBlock(String name) {
		m_name = name;
		m_instrList = new ArrayList<InstrIntf>();
	}
	
	/**
	 * add instruction at end
	 */
	public void addInstr(InstrIntf instr) {
		m_instrList.add(instr);
	}

	/**
	 * get iterator over all instructions in block
	 * @return
	 */
	public ListIterator<InstrIntf> getIterator() {
		return m_instrList.listIterator();
	}
	
	/**
	 * dump content
	 */
	public void dump(OutputStreamWriter os) throws Exception {
		os.write(m_name);
		os.write(":\n");
        ListIterator<InstrIntf> instrIter = m_instrList.listIterator();
	    while (instrIter.hasNext()) {
	        InstrIntf nextInstr = instrIter.next();
	        nextInstr.trace(os);
	    }
	}

	public String getName() {
		return m_name;
	}
}
