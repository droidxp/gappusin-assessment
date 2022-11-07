class com.csvreader.CsvReader$DataBuffer {
	 /* # instance fields */
	 public Buffer;
	 public Integer ColumnStart;
	 public Integer Count;
	 public Integer LineStart;
	 public Integer Position;
	 final com.csvreader.CsvReader this$0; //synthetic
	 /* # direct methods */
	 public com.csvreader.CsvReader$DataBuffer ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 v0, 0x400 */
		 /* new-array v0, v0, [C */
		 this.Buffer = v0;
		 /* iput v1, p0, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
		 /* iput v1, p0, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
		 /* iput v1, p0, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
		 /* iput v1, p0, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
		 return;
	 } // .end method
