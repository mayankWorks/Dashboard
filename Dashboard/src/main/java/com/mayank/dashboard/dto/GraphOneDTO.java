/**
 * 
 */
package com.mayank.dashboard.dto;

/**
 * @author Maverick
 *
 */
public class GraphOneDTO {

	private int xaxis;
	private int yaxis;

	public int getXaxis() {
		return xaxis;
	}
	public void setXaxis(int xaxis) {
		this.xaxis = xaxis;
	}
	public int getYaxis() {
		return yaxis;
	}
	public void setYaxis(int yaxis) {
		this.yaxis = yaxis;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xaxis;
		result = prime * result + yaxis;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GraphOneDTO other = (GraphOneDTO) obj;
		if (xaxis != other.xaxis)
			return false;
		if (yaxis != other.yaxis)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GraphOneDTO [xaxis=" + xaxis + ", yaxis=" + yaxis + "]";
	}

	
}

