package egov.service;

public class BoardVO {
	private int unq;
	private String title;
	private String pwd;
	private String name;
	private String content;
	private int hit;
	private String rdate;
	
	private String srchCond;
	private String srchWord;
	
	private String thread;
	private int fid;
	
	private int firstIdx;
	private int lastIdx;
	
	private int pageNo = 0;
	

	public String getThread() {
		return thread;
	}
	public void setThread(String thread) {
		this.thread = thread;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getSrchCond() {
		return srchCond;
	}
	public void setSrchCond(String srchCond) {
		this.srchCond = srchCond;
	}
	public String getSrchWord() {
		return srchWord;
	}
	public void setSrchWord(String srchWord) {
		this.srchWord = srchWord;
	}
	public int getUnq() {
		return unq;
	}
	public void setUnq(int unq) {
		this.unq = unq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public int getFirstIdx() {
		return firstIdx;
	}
	public void setFirstIdx(int firstIdx) {
		this.firstIdx = firstIdx;
	}
	public int getLastIdx() {
		return lastIdx;
	}
	public void setLastIdx(int lastIdx) {
		this.lastIdx = lastIdx;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	
}
