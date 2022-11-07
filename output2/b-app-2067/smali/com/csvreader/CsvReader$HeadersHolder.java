class com.csvreader.CsvReader$HeadersHolder {
	 /* # instance fields */
	 public java.lang.String Headers;
	 public java.util.HashMap IndexByName;
	 public Integer Length;
	 final com.csvreader.CsvReader this$0; //synthetic
	 /* # direct methods */
	 public com.csvreader.CsvReader$HeadersHolder ( ) {
		 /* .locals 1 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.Headers = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.IndexByName = v0;
		 return;
	 } // .end method
