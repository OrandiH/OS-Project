package osproject;

public class MapEntry {
	private String key;
	private int Value;
	private MapEntry NextMapEntry;
	
	public MapEntry()
	{
		this.key = "";
		this.Value = 0;
		this.NextMapEntry = null;
	}
	
	public MapEntry(String k,int val,MapEntry NextMapEntry)
	{
		this.key = k;
		this.Value = val;
		this.NextMapEntry = NextMapEntry;
	}
	
	public MapEntry(String K,int Val)
	{
		this.key = K;
		this.Value = Val;
		this.NextMapEntry = null;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}

	public MapEntry getNextMapEntry() {
		return NextMapEntry;
	}

	public void setNextMapEntry(MapEntry nextMapEntry) {
		NextMapEntry = nextMapEntry;
	}
	
	public String ToString()
	{
		return new String("Key: " + this.key + "Value: " + this.Value);
	}
	
	public void Display()
	{
		System.out.println("Map Entry:" + this.key + " " + " " + this.Value);
	}
}
