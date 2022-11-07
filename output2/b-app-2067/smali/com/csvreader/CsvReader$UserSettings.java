class com.csvreader.CsvReader$UserSettings {
	 /* # instance fields */
	 public Boolean CaptureRawRecord;
	 public Boolean CaseSensitive;
	 public Object Comment;
	 public Object Delimiter;
	 public Integer EscapeMode;
	 public Object RecordDelimiter;
	 public Boolean SafetySwitch;
	 public Boolean SkipEmptyRecords;
	 public Object TextQualifier;
	 public Boolean TrimWhitespace;
	 public Boolean UseComments;
	 public Boolean UseTextQualifier;
	 final com.csvreader.CsvReader this$0; //synthetic
	 /* # direct methods */
	 public com.csvreader.CsvReader$UserSettings ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 1; // const/4 v1, 0x1
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v1, p0, Lcom/csvreader/CsvReader$UserSettings;->CaseSensitive:Z */
		 /* const/16 v0, 0x22 */
		 /* iput-char v0, p0, Lcom/csvreader/CsvReader$UserSettings;->TextQualifier:C */
		 /* iput-boolean v1, p0, Lcom/csvreader/CsvReader$UserSettings;->TrimWhitespace:Z */
		 /* iput-boolean v1, p0, Lcom/csvreader/CsvReader$UserSettings;->UseTextQualifier:Z */
		 /* const/16 v0, 0x2c */
		 /* iput-char v0, p0, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
		 /* iput-char v2, p0, Lcom/csvreader/CsvReader$UserSettings;->RecordDelimiter:C */
		 /* const/16 v0, 0x23 */
		 /* iput-char v0, p0, Lcom/csvreader/CsvReader$UserSettings;->Comment:C */
		 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader$UserSettings;->UseComments:Z */
		 /* iput v1, p0, Lcom/csvreader/CsvReader$UserSettings;->EscapeMode:I */
		 /* iput-boolean v1, p0, Lcom/csvreader/CsvReader$UserSettings;->SafetySwitch:Z */
		 /* iput-boolean v1, p0, Lcom/csvreader/CsvReader$UserSettings;->SkipEmptyRecords:Z */
		 /* iput-boolean v1, p0, Lcom/csvreader/CsvReader$UserSettings;->CaptureRawRecord:Z */
		 return;
	 } // .end method
