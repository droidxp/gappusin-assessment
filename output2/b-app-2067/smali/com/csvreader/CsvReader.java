public class com.csvreader.CsvReader {
	 /* # static fields */
	 public static final Integer ESCAPE_MODE_BACKSLASH;
	 public static final Integer ESCAPE_MODE_DOUBLED;
	 /* # instance fields */
	 private java.nio.charset.Charset charset;
	 private Boolean closed;
	 private com.csvreader.CsvReader$ColumnBuffer columnBuffer;
	 private Integer columnsCount;
	 private Long currentRecord;
	 private com.csvreader.CsvReader$DataBuffer dataBuffer;
	 private java.lang.String fileName;
	 private Boolean hasMoreData;
	 private Boolean hasReadNextLine;
	 private com.csvreader.CsvReader$HeadersHolder headersHolder;
	 private Boolean initialized;
	 private java.io.Reader inputStream;
	 private isQualified;
	 private Object lastLetter;
	 private com.csvreader.CsvReader$RawRecordBuffer rawBuffer;
	 private java.lang.String rawRecord;
	 private Boolean startedColumn;
	 private Boolean startedWithQualifier;
	 private Boolean useCustomRecordDelimiter;
	 private com.csvreader.CsvReader$UserSettings userSettings;
	 private java.lang.String values;
	 /* # direct methods */
	 public com.csvreader.CsvReader ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/io/InputStreamReader; */
		 /* invoke-direct {v0, p1, p3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V */
		 /* invoke-direct {p0, v0, p2}, Lcom/csvreader/CsvReader;-><init>(Ljava/io/Reader;C)V */
		 return;
	 } // .end method
	 public com.csvreader.CsvReader ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/io/InputStreamReader; */
		 /* invoke-direct {v0, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V */
		 /* invoke-direct {p0, v0}, Lcom/csvreader/CsvReader;-><init>(Ljava/io/Reader;)V */
		 return;
	 } // .end method
	 public com.csvreader.CsvReader ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x2c */
		 /* invoke-direct {p0, p1, v0}, Lcom/csvreader/CsvReader;-><init>(Ljava/io/Reader;C)V */
		 return;
	 } // .end method
	 public com.csvreader.CsvReader ( ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.inputStream = v1;
		 this.fileName = v1;
		 /* new-instance v0, Lcom/csvreader/CsvReader$UserSettings; */
		 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$UserSettings;-><init>(Lcom/csvreader/CsvReader;)V */
		 this.userSettings = v0;
		 this.charset = v1;
		 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
		 /* new-instance v0, Lcom/csvreader/CsvReader$DataBuffer; */
		 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$DataBuffer;-><init>(Lcom/csvreader/CsvReader;)V */
		 this.dataBuffer = v0;
		 /* new-instance v0, Lcom/csvreader/CsvReader$ColumnBuffer; */
		 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$ColumnBuffer;-><init>(Lcom/csvreader/CsvReader;)V */
		 this.columnBuffer = v0;
		 /* new-instance v0, Lcom/csvreader/CsvReader$RawRecordBuffer; */
		 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$RawRecordBuffer;-><init>(Lcom/csvreader/CsvReader;)V */
		 this.rawBuffer = v0;
		 this.isQualified = v1;
		 final String v0 = ""; // const-string v0, ""
		 this.rawRecord = v0;
		 /* new-instance v0, Lcom/csvreader/CsvReader$HeadersHolder; */
		 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$HeadersHolder;-><init>(Lcom/csvreader/CsvReader;)V */
		 this.headersHolder = v0;
		 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
		 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->startedWithQualifier:Z */
		 /* iput-boolean v3, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
		 /* iput-char v2, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
		 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->hasReadNextLine:Z */
		 /* iput v2, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
		 /* const/16 v0, 0xa */
		 /* new-array v0, v0, [Ljava/lang/String; */
		 this.values = v0;
		 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->initialized:Z */
		 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->closed:Z */
		 /* if-nez p1, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "Parameter inputStream can not be null."; // const-string v1, "Parameter inputStream can not be null."
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 this.inputStream = p1;
	 v0 = this.userSettings;
	 /* iput-char p2, v0, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
	 /* iput-boolean v3, p0, Lcom/csvreader/CsvReader;->initialized:Z */
	 v0 = this.values;
	 /* array-length v0, v0 */
	 /* new-array v0, v0, [Z */
	 this.isQualified = v0;
	 return;
} // .end method
public com.csvreader.CsvReader ( ) {
	 /* .locals 1 */
	 /* const/16 v0, 0x2c */
	 /* invoke-direct {p0, p1, v0}, Lcom/csvreader/CsvReader;-><init>(Ljava/lang/String;C)V */
	 return;
} // .end method
public com.csvreader.CsvReader ( ) {
	 /* .locals 1 */
	 final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
	 java.nio.charset.Charset .forName ( v0 );
	 /* invoke-direct {p0, p1, p2, v0}, Lcom/csvreader/CsvReader;-><init>(Ljava/lang/String;CLjava/nio/charset/Charset;)V */
	 return;
} // .end method
public com.csvreader.CsvReader ( ) {
	 /* .locals 3 */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 0; // const/4 v2, 0x0
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 this.inputStream = v1;
	 this.fileName = v1;
	 /* new-instance v0, Lcom/csvreader/CsvReader$UserSettings; */
	 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$UserSettings;-><init>(Lcom/csvreader/CsvReader;)V */
	 this.userSettings = v0;
	 this.charset = v1;
	 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
	 /* new-instance v0, Lcom/csvreader/CsvReader$DataBuffer; */
	 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$DataBuffer;-><init>(Lcom/csvreader/CsvReader;)V */
	 this.dataBuffer = v0;
	 /* new-instance v0, Lcom/csvreader/CsvReader$ColumnBuffer; */
	 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$ColumnBuffer;-><init>(Lcom/csvreader/CsvReader;)V */
	 this.columnBuffer = v0;
	 /* new-instance v0, Lcom/csvreader/CsvReader$RawRecordBuffer; */
	 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$RawRecordBuffer;-><init>(Lcom/csvreader/CsvReader;)V */
	 this.rawBuffer = v0;
	 this.isQualified = v1;
	 final String v0 = ""; // const-string v0, ""
	 this.rawRecord = v0;
	 /* new-instance v0, Lcom/csvreader/CsvReader$HeadersHolder; */
	 /* invoke-direct {v0, p0}, Lcom/csvreader/CsvReader$HeadersHolder;-><init>(Lcom/csvreader/CsvReader;)V */
	 this.headersHolder = v0;
	 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
	 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->startedWithQualifier:Z */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
	 /* iput-char v2, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
	 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->hasReadNextLine:Z */
	 /* iput v2, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
	 /* const-wide/16 v0, 0x0 */
	 /* iput-wide v0, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
	 /* const/16 v0, 0xa */
	 /* new-array v0, v0, [Ljava/lang/String; */
	 this.values = v0;
	 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->initialized:Z */
	 /* iput-boolean v2, p0, Lcom/csvreader/CsvReader;->closed:Z */
	 /* if-nez p1, :cond_0 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "Parameter fileName can not be null."; // const-string v1, "Parameter fileName can not be null."
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
/* if-nez p3, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Parameter charset can not be null."; // const-string v1, "Parameter charset can not be null."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v0, :cond_2 */
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "File "; // const-string v2, "File "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " does not exist."; // const-string v2, " does not exist."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
this.fileName = p1;
v0 = this.userSettings;
/* iput-char p2, v0, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
this.charset = p3;
v0 = this.values;
/* array-length v0, v0 */
/* new-array v0, v0, [Z */
this.isQualified = v0;
return;
} // .end method
private void appendLetter ( Object p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = this.columnBuffer;
/* iget v0, v0, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
v1 = this.columnBuffer;
v1 = this.Buffer;
/* array-length v1, v1 */
/* if-ne v0, v1, :cond_0 */
v0 = this.columnBuffer;
v0 = this.Buffer;
/* array-length v0, v0 */
/* mul-int/lit8 v0, v0, 0x2 */
/* new-array v0, v0, [C */
v1 = this.columnBuffer;
v1 = this.Buffer;
v2 = this.columnBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
java.lang.System .arraycopy ( v1,v3,v0,v3,v2 );
v1 = this.columnBuffer;
this.Buffer = v0;
} // :cond_0
v0 = this.columnBuffer;
v0 = this.Buffer;
v1 = this.columnBuffer;
/* iget v2, v1, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, v1, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
/* aput-char p1, v0, v2 */
v0 = this.dataBuffer;
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
return;
} // .end method
private void checkClosed ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->closed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "This instance of the CsvReader class has already been closed."; // const-string v1, "This instance of the CsvReader class has already been closed."
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
return;
} // .end method
private void checkDataLength ( ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->initialized:Z */
/* if-nez v0, :cond_1 */
v0 = this.fileName;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Ljava/io/BufferedReader; */
/* new-instance v1, Ljava/io/InputStreamReader; */
/* new-instance v2, Ljava/io/FileInputStream; */
v3 = this.fileName;
/* invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
v3 = this.charset;
/* invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V */
/* const/16 v2, 0x1000 */
/* invoke-direct {v0, v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V */
this.inputStream = v0;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
this.charset = v0;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->initialized:Z */
} // :cond_1
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->updateCurrentValue()V */
v0 = this.userSettings;
/* iget-boolean v0, v0, Lcom/csvreader/CsvReader$UserSettings;->CaptureRawRecord:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.dataBuffer;
/* iget v0, v0, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
/* if-lez v0, :cond_3 */
v0 = this.rawBuffer;
v0 = this.Buffer;
/* array-length v0, v0 */
v1 = this.rawBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
/* sub-int/2addr v0, v1 */
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
/* sub-int/2addr v1, v2 */
/* if-ge v0, v1, :cond_2 */
v0 = this.rawBuffer;
v0 = this.Buffer;
/* array-length v0, v0 */
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
/* sub-int/2addr v1, v2 */
v2 = this.rawBuffer;
v2 = this.Buffer;
/* array-length v2, v2 */
v1 = java.lang.Math .max ( v1,v2 );
/* add-int/2addr v0, v1 */
/* new-array v0, v0, [C */
v1 = this.rawBuffer;
v1 = this.Buffer;
v2 = this.rawBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
java.lang.System .arraycopy ( v1,v6,v0,v6,v2 );
v1 = this.rawBuffer;
this.Buffer = v0;
} // :cond_2
v0 = this.dataBuffer;
v0 = this.Buffer;
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
v2 = this.rawBuffer;
v2 = this.Buffer;
v3 = this.rawBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
v4 = this.dataBuffer;
/* iget v4, v4, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
v5 = this.dataBuffer;
/* iget v5, v5, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
/* sub-int/2addr v4, v5 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
v0 = this.rawBuffer;
/* iget v1, v0, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
v3 = this.dataBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
/* sub-int/2addr v2, v3 */
/* add-int/2addr v1, v2 */
/* iput v1, v0, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
} // :cond_3
try { // :try_start_0
v0 = this.dataBuffer;
v1 = this.inputStream;
v2 = this.dataBuffer;
v2 = this.Buffer;
int v3 = 0; // const/4 v3, 0x0
v4 = this.dataBuffer;
v4 = this.Buffer;
/* array-length v4, v4 */
v1 = (( java.io.Reader ) v1 ).read ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Ljava/io/Reader;->read([CII)I
/* iput v1, v0, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
v0 = this.dataBuffer;
/* iget v0, v0, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_4 */
/* iput-boolean v6, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
} // :cond_4
v0 = this.dataBuffer;
/* iput v6, v0, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v0 = this.dataBuffer;
/* iput v6, v0, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
v0 = this.dataBuffer;
/* iput v6, v0, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
return;
/* :catch_0 */
/* move-exception v0 */
(( com.csvreader.CsvReader ) p0 ).close ( ); // invoke-virtual {p0}, Lcom/csvreader/CsvReader;->close()V
/* throw v0 */
} // .end method
private void close ( Boolean p0 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->closed:Z */
/* if-nez v0, :cond_2 */
if ( p1 != null) { // if-eqz p1, :cond_0
this.charset = v1;
v0 = this.headersHolder;
this.Headers = v1;
v0 = this.headersHolder;
this.IndexByName = v1;
v0 = this.dataBuffer;
this.Buffer = v1;
v0 = this.columnBuffer;
this.Buffer = v1;
v0 = this.rawBuffer;
this.Buffer = v1;
} // :cond_0
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->initialized:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.inputStream;
(( java.io.Reader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/Reader;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_1
} // :goto_0
this.inputStream = v1;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->closed:Z */
} // :cond_2
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
private void endColumn ( ) {
/* .locals 6 */
int v4 = 1; // const/4 v4, 0x1
/* const/16 v3, 0x20 */
int v5 = 0; // const/4 v5, 0x0
final String v0 = ""; // const-string v0, ""
/* iget-boolean v1, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.columnBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
/* if-nez v1, :cond_3 */
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* if-ge v1, v2, :cond_1 */
v0 = this.dataBuffer;
/* iget v0, v0, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* sub-int/2addr v0, v4 */
v1 = this.userSettings;
/* iget-boolean v1, v1, Lcom/csvreader/CsvReader$UserSettings;->TrimWhitespace:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget-boolean v1, p0, Lcom/csvreader/CsvReader;->startedWithQualifier:Z */
/* if-nez v1, :cond_0 */
} // :goto_0
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* if-lt v0, v1, :cond_0 */
v1 = this.dataBuffer;
v1 = this.Buffer;
/* aget-char v1, v1, v0 */
/* if-eq v1, v3, :cond_2 */
v1 = this.dataBuffer;
v1 = this.Buffer;
/* aget-char v1, v1, v0 */
/* const/16 v2, 0x9 */
/* if-eq v1, v2, :cond_2 */
} // :cond_0
/* new-instance v1, Ljava/lang/String; */
v2 = this.dataBuffer;
v2 = this.Buffer;
v3 = this.dataBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
v4 = this.dataBuffer;
/* iget v4, v4, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* sub-int/2addr v0, v4 */
/* add-int/lit8 v0, v0, 0x1 */
/* invoke-direct {v1, v2, v3, v0}, Ljava/lang/String;-><init>([CII)V */
/* move-object v0, v1 */
} // :cond_1
} // :goto_1
v1 = this.columnBuffer;
/* iput v5, v1, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
/* iput-boolean v5, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
/* iget v1, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* const v2, 0x186a0 */
/* if-lt v1, v2, :cond_6 */
v1 = this.userSettings;
/* iget-boolean v1, v1, Lcom/csvreader/CsvReader$UserSettings;->SafetySwitch:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
(( com.csvreader.CsvReader ) p0 ).close ( ); // invoke-virtual {p0}, Lcom/csvreader/CsvReader;->close()V
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Maximum column count of 100,000 exceeded in record "; // const-string v2, "Maximum column count of 100,000 exceeded in record "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.text.NumberFormat .getIntegerInstance ( );
/* iget-wide v3, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
(( java.text.NumberFormat ) v2 ).format ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ".Set the SafetySwitch property to false"; // const-string v2, ".Set the SafetySwitch property to false"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " if you\'re expecting more than 100,000 columns per record to"; // const-string v2, " if you\'re expecting more than 100,000 columns per record to"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " avoid this error."; // const-string v2, " avoid this error."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_3
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->updateCurrentValue()V */
v0 = this.columnBuffer;
/* iget v0, v0, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
/* sub-int/2addr v0, v4 */
v1 = this.userSettings;
/* iget-boolean v1, v1, Lcom/csvreader/CsvReader$UserSettings;->TrimWhitespace:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
/* iget-boolean v1, p0, Lcom/csvreader/CsvReader;->startedWithQualifier:Z */
/* if-nez v1, :cond_4 */
} // :goto_2
/* if-ltz v0, :cond_4 */
v1 = this.columnBuffer;
v1 = this.Buffer;
/* aget-char v1, v1, v0 */
/* if-eq v1, v3, :cond_5 */
v1 = this.columnBuffer;
v1 = this.Buffer;
/* aget-char v1, v1, v0 */
/* if-eq v1, v3, :cond_5 */
} // :cond_4
/* new-instance v1, Ljava/lang/String; */
v2 = this.columnBuffer;
v2 = this.Buffer;
/* add-int/lit8 v0, v0, 0x1 */
/* invoke-direct {v1, v2, v5, v0}, Ljava/lang/String;-><init>([CII)V */
/* move-object v0, v1 */
} // :cond_5
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_6
/* iget v1, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
v2 = this.values;
/* array-length v2, v2 */
/* if-ne v1, v2, :cond_7 */
v1 = this.values;
/* array-length v1, v1 */
/* mul-int/lit8 v1, v1, 0x2 */
/* new-array v2, v1, [Ljava/lang/String; */
v3 = this.values;
v4 = this.values;
/* array-length v4, v4 */
java.lang.System .arraycopy ( v3,v5,v2,v5,v4 );
this.values = v2;
/* new-array v1, v1, [Z */
v2 = this.isQualified;
v3 = this.isQualified;
/* array-length v3, v3 */
java.lang.System .arraycopy ( v2,v5,v1,v5,v3 );
this.isQualified = v1;
} // :cond_7
v1 = this.values;
/* iget v2, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* aput-object v0, v1, v2 */
v0 = this.isQualified;
/* iget v1, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* iget-boolean v2, p0, Lcom/csvreader/CsvReader;->startedWithQualifier:Z */
/* aput-boolean v2, v0, v1 */
/* iget v0, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
return;
} // .end method
private void endRecord ( ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->hasReadNextLine:Z */
/* iget-wide v0, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
/* const-wide/16 v2, 0x1 */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
return;
} // .end method
private static Object hexToDec ( Object p0 ) {
/* .locals 2 */
/* const/16 v1, 0x61 */
/* const/16 v0, 0x41 */
/* if-lt p0, v1, :cond_0 */
/* sub-int v0, p0, v1 */
/* add-int/lit8 v0, v0, 0xa */
/* int-to-char v0, v0 */
} // :goto_0
} // :cond_0
/* if-lt p0, v0, :cond_1 */
/* sub-int v0, p0, v0 */
/* add-int/lit8 v0, v0, 0xa */
/* int-to-char v0, v0 */
} // :cond_1
/* const/16 v0, 0x30 */
/* sub-int v0, p0, v0 */
/* int-to-char v0, v0 */
} // .end method
public static com.csvreader.CsvReader parse ( java.lang.String p0 ) {
/* .locals 2 */
/* if-nez p0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Parameter data can not be null."; // const-string v1, "Parameter data can not be null."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* new-instance v0, Lcom/csvreader/CsvReader; */
/* new-instance v1, Ljava/io/StringReader; */
/* invoke-direct {v1, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v0, v1}, Lcom/csvreader/CsvReader;-><init>(Ljava/io/Reader;)V */
} // .end method
private void updateCurrentValue ( ) {
/* .locals 6 */
int v3 = 0; // const/4 v3, 0x0
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.dataBuffer;
/* iget v0, v0, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* if-ge v0, v1, :cond_1 */
v0 = this.columnBuffer;
v0 = this.Buffer;
/* array-length v0, v0 */
v1 = this.columnBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
/* sub-int/2addr v0, v1 */
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* sub-int/2addr v1, v2 */
/* if-ge v0, v1, :cond_0 */
v0 = this.columnBuffer;
v0 = this.Buffer;
/* array-length v0, v0 */
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* sub-int/2addr v1, v2 */
v2 = this.columnBuffer;
v2 = this.Buffer;
/* array-length v2, v2 */
v1 = java.lang.Math .max ( v1,v2 );
/* add-int/2addr v0, v1 */
/* new-array v0, v0, [C */
v1 = this.columnBuffer;
v1 = this.Buffer;
v2 = this.columnBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
java.lang.System .arraycopy ( v1,v3,v0,v3,v2 );
v1 = this.columnBuffer;
this.Buffer = v0;
} // :cond_0
v0 = this.dataBuffer;
v0 = this.Buffer;
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
v2 = this.columnBuffer;
v2 = this.Buffer;
v3 = this.columnBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
v4 = this.dataBuffer;
/* iget v4, v4, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v5 = this.dataBuffer;
/* iget v5, v5, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* sub-int/2addr v4, v5 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
v0 = this.columnBuffer;
/* iget v1, v0, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v3 = this.dataBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* sub-int/2addr v2, v3 */
/* add-int/2addr v1, v2 */
/* iput v1, v0, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
} // :cond_1
v0 = this.dataBuffer;
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
return;
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->closed:Z */
/* if-nez v0, :cond_0 */
/* invoke-direct {p0, v1}, Lcom/csvreader/CsvReader;->close(Z)V */
/* iput-boolean v1, p0, Lcom/csvreader/CsvReader;->closed:Z */
} // :cond_0
return;
} // .end method
protected void finalize ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lcom/csvreader/CsvReader;->close(Z)V */
return;
} // .end method
public java.lang.String get ( Integer p0 ) {
/* .locals 1 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* if-ltz p1, :cond_0 */
/* iget v0, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* if-ge p1, v0, :cond_0 */
v0 = this.values;
/* aget-object v0, v0, p1 */
} // :goto_1
} // :cond_0
final String v0 = ""; // const-string v0, ""
/* :catch_0 */
/* move-exception v0 */
} // .end method
public java.lang.String get ( java.lang.String p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
v0 = (( com.csvreader.CsvReader ) p0 ).getIndex ( p1 ); // invoke-virtual {p0, p1}, Lcom/csvreader/CsvReader;->getIndex(Ljava/lang/String;)I
(( com.csvreader.CsvReader ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
} // .end method
public Boolean getCaptureRawRecord ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-boolean v0, v0, Lcom/csvreader/CsvReader$UserSettings;->CaptureRawRecord:Z */
} // .end method
public Integer getColumnCount ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
} // .end method
public Object getComment ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-char v0, v0, Lcom/csvreader/CsvReader$UserSettings;->Comment:C */
} // .end method
public Long getCurrentRecord ( ) {
/* .locals 4 */
/* iget-wide v0, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
/* const-wide/16 v2, 0x1 */
/* sub-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Object getDelimiter ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-char v0, v0, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
} // .end method
public Integer getEscapeMode ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget v0, v0, Lcom/csvreader/CsvReader$UserSettings;->EscapeMode:I */
} // .end method
public java.lang.String getHeader ( Integer p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
/* if-ltz p1, :cond_0 */
v0 = this.headersHolder;
/* iget v0, v0, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
/* if-ge p1, v0, :cond_0 */
v0 = this.headersHolder;
v0 = this.Headers;
/* aget-object v0, v0, p1 */
} // :goto_0
} // :cond_0
final String v0 = ""; // const-string v0, ""
} // .end method
public Integer getHeaderCount ( ) {
/* .locals 1 */
v0 = this.headersHolder;
/* iget v0, v0, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
} // .end method
public java.lang.String getHeaders ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
v0 = this.headersHolder;
v0 = this.Headers;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.headersHolder;
/* iget v0, v0, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
/* new-array v0, v0, [Ljava/lang/String; */
v1 = this.headersHolder;
v1 = this.Headers;
v2 = this.headersHolder;
/* iget v2, v2, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
java.lang.System .arraycopy ( v1,v3,v0,v3,v2 );
} // .end method
public Integer getIndex ( java.lang.String p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
v0 = this.headersHolder;
v0 = this.IndexByName;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
if ( p0 != null) { // if-eqz p0, :cond_0
/* check-cast p0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
} // :goto_0
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
} // .end method
public java.lang.String getRawRecord ( ) {
/* .locals 1 */
v0 = this.rawRecord;
} // .end method
public Object getRecordDelimiter ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-char v0, v0, Lcom/csvreader/CsvReader$UserSettings;->RecordDelimiter:C */
} // .end method
public Boolean getSafetySwitch ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-boolean v0, v0, Lcom/csvreader/CsvReader$UserSettings;->SafetySwitch:Z */
} // .end method
public Boolean getSkipEmptyRecords ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-boolean v0, v0, Lcom/csvreader/CsvReader$UserSettings;->SkipEmptyRecords:Z */
} // .end method
public Object getTextQualifier ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-char v0, v0, Lcom/csvreader/CsvReader$UserSettings;->TextQualifier:C */
} // .end method
public Boolean getTrimWhitespace ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-boolean v0, v0, Lcom/csvreader/CsvReader$UserSettings;->TrimWhitespace:Z */
} // .end method
public Boolean getUseComments ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-boolean v0, v0, Lcom/csvreader/CsvReader$UserSettings;->UseComments:Z */
} // .end method
public Boolean getUseTextQualifier ( ) {
/* .locals 1 */
v0 = this.userSettings;
/* iget-boolean v0, v0, Lcom/csvreader/CsvReader$UserSettings;->UseTextQualifier:Z */
} // .end method
public java.lang.String getValues ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
/* iget v0, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* new-array v0, v0, [Ljava/lang/String; */
v1 = this.values;
/* iget v2, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
java.lang.System .arraycopy ( v1,v3,v0,v3,v2 );
} // .end method
public Boolean isQualified ( Integer p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
/* iget v0, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* if-ge p1, v0, :cond_0 */
/* if-ltz p1, :cond_0 */
v0 = this.isQualified;
/* aget-boolean v0, v0, p1 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean readHeaders ( ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
v0 = (( com.csvreader.CsvReader ) p0 ).readRecord ( ); // invoke-virtual {p0}, Lcom/csvreader/CsvReader;->readRecord()Z
v1 = this.headersHolder;
/* iget v2, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* iput v2, v1, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
v1 = this.headersHolder;
/* iget v2, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* new-array v2, v2, [Ljava/lang/String; */
this.Headers = v2;
/* move v1, v5 */
} // :goto_0
v2 = this.headersHolder;
/* iget v2, v2, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
/* if-lt v1, v2, :cond_1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-wide v1, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
/* const-wide/16 v3, 0x1 */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
} // :cond_0
/* iput v5, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
} // :cond_1
(( com.csvreader.CsvReader ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v3 = this.headersHolder;
v3 = this.Headers;
/* aput-object v2, v3, v1 */
v3 = this.headersHolder;
v3 = this.IndexByName;
/* new-instance v4, Ljava/lang/Integer; */
/* invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v3 ).put ( v2, v4 ); // invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public Boolean readRecord ( ) {
/* .locals 14 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
v0 = this.rawBuffer;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v0, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
v0 = this.dataBuffer;
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* iput v1, v0, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->hasReadNextLine:Z */
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
} // :cond_0
v0 = this.dataBuffer;
/* iget v0, v0, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
/* if-ne v0, v1, :cond_5 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkDataLength()V */
} // :cond_1
} // :goto_0
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->hasReadNextLine:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_2
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
/* if-nez v0, :cond_3 */
/* iget-char v0, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
v1 = this.userSettings;
/* iget-char v1, v1, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
/* if-ne v0, v1, :cond_4 */
} // :cond_3
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endRecord()V */
} // :cond_4
v0 = this.userSettings;
/* iget-boolean v0, v0, Lcom/csvreader/CsvReader$UserSettings;->CaptureRawRecord:Z */
if ( v0 != null) { // if-eqz v0, :cond_36
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v0 != null) { // if-eqz v0, :cond_35
v0 = this.rawBuffer;
/* iget v0, v0, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
/* if-nez v0, :cond_34 */
/* new-instance v0, Ljava/lang/String; */
v1 = this.dataBuffer;
v1 = this.Buffer;
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
v3 = this.dataBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v4 = this.dataBuffer;
/* iget v4, v4, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
/* sub-int/2addr v3, v4 */
int v4 = 1; // const/4 v4, 0x1
/* sub-int/2addr v3, v4 */
/* invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V */
this.rawRecord = v0;
} // :goto_1
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->hasReadNextLine:Z */
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->startedWithQualifier:Z */
v0 = this.dataBuffer;
v0 = this.Buffer;
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* aget-char v0, v0, v1 */
v1 = this.userSettings;
/* iget-boolean v1, v1, Lcom/csvreader/CsvReader$UserSettings;->UseTextQualifier:Z */
if ( v1 != null) { // if-eqz v1, :cond_1c
v1 = this.userSettings;
/* iget-char v1, v1, Lcom/csvreader/CsvReader$UserSettings;->TextQualifier:C */
/* if-ne v0, v1, :cond_1c */
/* iput-char v0, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
v0 = this.dataBuffer;
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->startedWithQualifier:Z */
int v0 = 0; // const/4 v0, 0x0
v1 = this.userSettings;
/* iget-char v1, v1, Lcom/csvreader/CsvReader$UserSettings;->TextQualifier:C */
v2 = this.userSettings;
/* iget v2, v2, Lcom/csvreader/CsvReader$UserSettings;->EscapeMode:I */
int v3 = 2; // const/4 v3, 0x2
/* if-ne v2, v3, :cond_6 */
/* const/16 v1, 0x5c */
} // :cond_6
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
v8 = this.dataBuffer;
/* iget v9, v8, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v9, v9, 0x1 */
/* iput v9, v8, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* move v11, v7 */
/* move v7, v0 */
/* move v0, v11 */
/* move v12, v5 */
/* move v5, v3 */
/* move v3, v12 */
/* move v13, v2 */
/* move v2, v6 */
/* move v6, v13 */
} // :cond_7
v8 = this.dataBuffer;
/* iget v8, v8, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v9 = this.dataBuffer;
/* iget v9, v9, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
/* if-ne v8, v9, :cond_a */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkDataLength()V */
} // :cond_8
/* iget-boolean v8, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v8 != null) { // if-eqz v8, :cond_9
/* iget-boolean v8, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
/* if-nez v8, :cond_7 */
} // :cond_9
} // :goto_2
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.dataBuffer;
/* iget v1, v0, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* goto/16 :goto_0 */
} // :cond_a
v8 = this.dataBuffer;
v8 = this.Buffer;
v9 = this.dataBuffer;
/* iget v9, v9, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* aget-char v8, v8, v9 */
if ( v6 != null) { // if-eqz v6, :cond_f
v9 = this.dataBuffer;
v10 = this.dataBuffer;
/* iget v10, v10, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v10, v10, 0x1 */
/* iput v10, v9, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
v9 = this.userSettings;
/* iget-char v9, v9, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
/* if-ne v8, v9, :cond_c */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
} // :cond_b
} // :goto_3
/* iput-char v8, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
/* iget-boolean v8, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
if ( v8 != null) { // if-eqz v8, :cond_8
v8 = this.dataBuffer;
/* iget v9, v8, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v9, v9, 0x1 */
/* iput v9, v8, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v8 = this.userSettings;
/* iget-boolean v8, v8, Lcom/csvreader/CsvReader$UserSettings;->SafetySwitch:Z */
if ( v8 != null) { // if-eqz v8, :cond_8
v8 = this.dataBuffer;
/* iget v8, v8, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v9 = this.dataBuffer;
/* iget v9, v9, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* sub-int/2addr v8, v9 */
v9 = this.columnBuffer;
/* iget v9, v9, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
/* add-int/2addr v8, v9 */
/* const v9, 0x186a0 */
/* if-le v8, v9, :cond_8 */
(( com.csvreader.CsvReader ) p0 ).close ( ); // invoke-virtual {p0}, Lcom/csvreader/CsvReader;->close()V
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Maximum column length of 100,000 exceeded in column "; // const-string v2, "Maximum column length of 100,000 exceeded in column "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.text.NumberFormat .getIntegerInstance ( );
/* iget v3, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* int-to-long v3, v3 */
(( java.text.NumberFormat ) v2 ).format ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " in record "; // const-string v2, " in record "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.text.NumberFormat .getIntegerInstance ( );
/* iget-wide v3, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
(( java.text.NumberFormat ) v2 ).format ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ".Set the SafetySwitch property to false"; // const-string v2, ".Set the SafetySwitch property to false"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " if you\'re expecting column lengths greater than 100,000 characters to"; // const-string v2, " if you\'re expecting column lengths greater than 100,000 characters to"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " avoid this error."; // const-string v2, " avoid this error."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_c
/* iget-boolean v9, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
/* if-nez v9, :cond_d */
/* const/16 v9, 0xd */
/* if-eq v8, v9, :cond_e */
/* const/16 v9, 0xa */
/* if-eq v8, v9, :cond_e */
} // :cond_d
/* iget-boolean v9, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
if ( v9 != null) { // if-eqz v9, :cond_b
v9 = this.userSettings;
/* iget-char v9, v9, Lcom/csvreader/CsvReader$UserSettings;->RecordDelimiter:C */
/* if-ne v8, v9, :cond_b */
} // :cond_e
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endRecord()V */
/* goto/16 :goto_3 */
} // :cond_f
if ( v4 != null) { // if-eqz v4, :cond_12
/* add-int/lit8 v2, v2, 0x1 */
/* packed-switch v3, :pswitch_data_0 */
} // :cond_10
} // :goto_4
/* if-nez v4, :cond_11 */
/* invoke-direct {p0, v0}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* goto/16 :goto_3 */
/* :pswitch_0 */
/* mul-int/lit8 v0, v0, 0x10 */
/* int-to-char v0, v0 */
v9 = com.csvreader.CsvReader .hexToDec ( v8 );
/* add-int/2addr v0, v9 */
/* int-to-char v0, v0 */
int v9 = 4; // const/4 v9, 0x4
/* if-ne v2, v9, :cond_10 */
int v4 = 0; // const/4 v4, 0x0
/* :pswitch_1 */
/* mul-int/lit8 v0, v0, 0x8 */
/* int-to-char v0, v0 */
/* const/16 v9, 0x30 */
/* sub-int v9, v8, v9 */
/* int-to-char v9, v9 */
/* add-int/2addr v0, v9 */
/* int-to-char v0, v0 */
int v9 = 3; // const/4 v9, 0x3
/* if-ne v2, v9, :cond_10 */
int v4 = 0; // const/4 v4, 0x0
/* :pswitch_2 */
/* mul-int/lit8 v0, v0, 0xa */
/* int-to-char v0, v0 */
/* const/16 v9, 0x30 */
/* sub-int v9, v8, v9 */
/* int-to-char v9, v9 */
/* add-int/2addr v0, v9 */
/* int-to-char v0, v0 */
int v9 = 3; // const/4 v9, 0x3
/* if-ne v2, v9, :cond_10 */
int v4 = 0; // const/4 v4, 0x0
/* :pswitch_3 */
/* mul-int/lit8 v0, v0, 0x10 */
/* int-to-char v0, v0 */
v9 = com.csvreader.CsvReader .hexToDec ( v8 );
/* add-int/2addr v0, v9 */
/* int-to-char v0, v0 */
int v9 = 2; // const/4 v9, 0x2
/* if-ne v2, v9, :cond_10 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_11
v9 = this.dataBuffer;
v10 = this.dataBuffer;
/* iget v10, v10, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v10, v10, 0x1 */
/* iput v10, v9, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* goto/16 :goto_3 */
} // :cond_12
v9 = this.userSettings;
/* iget-char v9, v9, Lcom/csvreader/CsvReader$UserSettings;->TextQualifier:C */
/* if-ne v8, v9, :cond_15 */
if ( v5 != null) { // if-eqz v5, :cond_13
int v5 = 0; // const/4 v5, 0x0
} // :goto_5
int v7 = 0; // const/4 v7, 0x0
/* goto/16 :goto_3 */
} // :cond_13
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->updateCurrentValue()V */
v7 = this.userSettings;
/* iget v7, v7, Lcom/csvreader/CsvReader$UserSettings;->EscapeMode:I */
int v9 = 1; // const/4 v9, 0x1
/* if-ne v7, v9, :cond_14 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_14
int v7 = 1; // const/4 v7, 0x1
/* goto/16 :goto_3 */
} // :cond_15
v9 = this.userSettings;
/* iget v9, v9, Lcom/csvreader/CsvReader$UserSettings;->EscapeMode:I */
int v10 = 2; // const/4 v10, 0x2
/* if-ne v9, v10, :cond_16 */
if ( v5 != null) { // if-eqz v5, :cond_16
/* sparse-switch v8, :sswitch_data_0 */
} // :goto_6
int v5 = 0; // const/4 v5, 0x0
/* goto/16 :goto_3 */
/* :sswitch_0 */
/* const/16 v5, 0xa */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_1 */
/* const/16 v5, 0xd */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_2 */
/* const/16 v5, 0x9 */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_3 */
/* const/16 v5, 0x8 */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_4 */
/* const/16 v5, 0xc */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_5 */
/* const/16 v5, 0x1b */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_6 */
/* const/16 v5, 0xb */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_7 */
int v5 = 7; // const/4 v5, 0x7
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_8 */
int v0 = 2; // const/4 v0, 0x2
int v2 = 1; // const/4 v2, 0x1
int v3 = 1; // const/4 v3, 0x1
/* const/16 v4, 0x30 */
/* sub-int v4, v8, v4 */
/* int-to-char v4, v4 */
v5 = this.dataBuffer;
v9 = this.dataBuffer;
/* iget v9, v9, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v9, v9, 0x1 */
/* iput v9, v5, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* move v11, v4 */
/* move v4, v2 */
/* move v2, v3 */
/* move v3, v0 */
/* move v0, v11 */
/* :sswitch_9 */
/* sparse-switch v8, :sswitch_data_1 */
/* move v0, v3 */
} // :goto_7
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
v5 = this.dataBuffer;
v9 = this.dataBuffer;
/* iget v9, v9, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v9, v9, 0x1 */
/* iput v9, v5, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* move v11, v4 */
/* move v4, v2 */
/* move v2, v3 */
/* move v3, v0 */
/* move v0, v11 */
/* :sswitch_a */
int v0 = 1; // const/4 v0, 0x1
/* :sswitch_b */
int v0 = 4; // const/4 v0, 0x4
/* :sswitch_c */
int v0 = 2; // const/4 v0, 0x2
/* :sswitch_d */
int v0 = 3; // const/4 v0, 0x3
} // :cond_16
/* if-ne v8, v1, :cond_17 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->updateCurrentValue()V */
int v5 = 1; // const/4 v5, 0x1
/* goto/16 :goto_3 */
} // :cond_17
if ( v7 != null) { // if-eqz v7, :cond_b
v7 = this.userSettings;
/* iget-char v7, v7, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
/* if-ne v8, v7, :cond_18 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* goto/16 :goto_5 */
} // :cond_18
/* iget-boolean v7, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
/* if-nez v7, :cond_19 */
/* const/16 v7, 0xd */
/* if-eq v8, v7, :cond_1a */
/* const/16 v7, 0xa */
/* if-eq v8, v7, :cond_1a */
} // :cond_19
/* iget-boolean v7, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
if ( v7 != null) { // if-eqz v7, :cond_1b
v7 = this.userSettings;
/* iget-char v7, v7, Lcom/csvreader/CsvReader$UserSettings;->RecordDelimiter:C */
/* if-ne v8, v7, :cond_1b */
} // :cond_1a
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endRecord()V */
/* goto/16 :goto_5 */
} // :cond_1b
v6 = this.dataBuffer;
v7 = this.dataBuffer;
/* iget v7, v7, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v7, v7, 0x1 */
/* iput v7, v6, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
int v6 = 1; // const/4 v6, 0x1
/* goto/16 :goto_5 */
} // :cond_1c
v1 = this.userSettings;
/* iget-char v1, v1, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
/* if-ne v0, v1, :cond_1d */
/* iput-char v0, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* goto/16 :goto_2 */
} // :cond_1d
/* iget-boolean v1, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
if ( v1 != null) { // if-eqz v1, :cond_20
v1 = this.userSettings;
/* iget-char v1, v1, Lcom/csvreader/CsvReader$UserSettings;->RecordDelimiter:C */
/* if-ne v0, v1, :cond_20 */
/* iget-boolean v1, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
/* if-nez v1, :cond_1e */
/* iget v1, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* if-gtz v1, :cond_1e */
v1 = this.userSettings;
/* iget-boolean v1, v1, Lcom/csvreader/CsvReader$UserSettings;->SkipEmptyRecords:Z */
/* if-nez v1, :cond_1f */
} // :cond_1e
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endRecord()V */
} // :goto_8
/* iput-char v0, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
/* goto/16 :goto_2 */
} // :cond_1f
v1 = this.dataBuffer;
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, v1, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
} // :cond_20
/* iget-boolean v1, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
/* if-nez v1, :cond_24 */
/* const/16 v1, 0xd */
/* if-eq v0, v1, :cond_21 */
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_24 */
} // :cond_21
/* iget-boolean v1, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
/* if-nez v1, :cond_22 */
/* iget v1, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* if-gtz v1, :cond_22 */
v1 = this.userSettings;
/* iget-boolean v1, v1, Lcom/csvreader/CsvReader$UserSettings;->SkipEmptyRecords:Z */
/* if-nez v1, :cond_23 */
/* const/16 v1, 0xd */
/* if-eq v0, v1, :cond_22 */
/* iget-char v1, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
/* const/16 v2, 0xd */
/* if-eq v1, v2, :cond_23 */
} // :cond_22
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endRecord()V */
} // :goto_9
/* iput-char v0, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
/* goto/16 :goto_2 */
} // :cond_23
v1 = this.dataBuffer;
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, v1, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
} // :cond_24
v1 = this.userSettings;
/* iget-boolean v1, v1, Lcom/csvreader/CsvReader$UserSettings;->UseComments:Z */
if ( v1 != null) { // if-eqz v1, :cond_25
/* iget v1, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* if-nez v1, :cond_25 */
v1 = this.userSettings;
/* iget-char v1, v1, Lcom/csvreader/CsvReader$UserSettings;->Comment:C */
/* if-ne v0, v1, :cond_25 */
/* iput-char v0, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
(( com.csvreader.CsvReader ) p0 ).skipLine ( ); // invoke-virtual {p0}, Lcom/csvreader/CsvReader;->skipLine()Z
/* goto/16 :goto_2 */
} // :cond_25
v1 = this.userSettings;
/* iget-boolean v1, v1, Lcom/csvreader/CsvReader$UserSettings;->TrimWhitespace:Z */
if ( v1 != null) { // if-eqz v1, :cond_27
/* const/16 v1, 0x20 */
/* if-eq v0, v1, :cond_26 */
/* const/16 v1, 0x9 */
/* if-ne v0, v1, :cond_27 */
} // :cond_26
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
v0 = this.dataBuffer;
v1 = this.dataBuffer;
/* iget v1, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* goto/16 :goto_2 */
} // :cond_27
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
v1 = this.dataBuffer;
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* iput v2, v1, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* move v11, v6 */
/* move v6, v0 */
/* move v0, v11 */
/* move v12, v4 */
/* move v4, v2 */
/* move v2, v12 */
/* move v13, v1 */
/* move v1, v5 */
/* move v5, v13 */
} // :cond_28
/* if-nez v0, :cond_29 */
v7 = this.dataBuffer;
/* iget v7, v7, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v8 = this.dataBuffer;
/* iget v8, v8, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
/* if-ne v7, v8, :cond_29 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkDataLength()V */
} // :goto_a
/* iget-boolean v7, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v7 != null) { // if-eqz v7, :cond_9
/* iget-boolean v7, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
/* if-nez v7, :cond_28 */
/* goto/16 :goto_2 */
} // :cond_29
/* if-nez v0, :cond_38 */
v0 = this.dataBuffer;
v0 = this.Buffer;
v6 = this.dataBuffer;
/* iget v6, v6, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* aget-char v0, v0, v6 */
} // :goto_b
v6 = this.userSettings;
/* iget-boolean v6, v6, Lcom/csvreader/CsvReader$UserSettings;->UseTextQualifier:Z */
/* if-nez v6, :cond_2c */
v6 = this.userSettings;
/* iget v6, v6, Lcom/csvreader/CsvReader$UserSettings;->EscapeMode:I */
int v7 = 2; // const/4 v7, 0x2
/* if-ne v6, v7, :cond_2c */
/* const/16 v6, 0x5c */
/* if-ne v0, v6, :cond_2c */
if ( v5 != null) { // if-eqz v5, :cond_2b
int v5 = 0; // const/4 v5, 0x0
} // :cond_2a
} // :goto_c
/* iput-char v0, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
int v6 = 0; // const/4 v6, 0x0
/* iget-boolean v7, p0, Lcom/csvreader/CsvReader;->startedColumn:Z */
if ( v7 != null) { // if-eqz v7, :cond_37
v7 = this.dataBuffer;
/* iget v8, v7, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v8, v8, 0x1 */
/* iput v8, v7, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v7 = this.userSettings;
/* iget-boolean v7, v7, Lcom/csvreader/CsvReader$UserSettings;->SafetySwitch:Z */
if ( v7 != null) { // if-eqz v7, :cond_37
v7 = this.dataBuffer;
/* iget v7, v7, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v8 = this.dataBuffer;
/* iget v8, v8, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* sub-int/2addr v7, v8 */
v8 = this.columnBuffer;
/* iget v8, v8, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
/* add-int/2addr v7, v8 */
/* const v8, 0x186a0 */
/* if-le v7, v8, :cond_37 */
(( com.csvreader.CsvReader ) p0 ).close ( ); // invoke-virtual {p0}, Lcom/csvreader/CsvReader;->close()V
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Maximum column length of 100,000 exceeded in column "; // const-string v2, "Maximum column length of 100,000 exceeded in column "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.text.NumberFormat .getIntegerInstance ( );
/* iget v3, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* int-to-long v3, v3 */
(( java.text.NumberFormat ) v2 ).format ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " in record "; // const-string v2, " in record "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.text.NumberFormat .getIntegerInstance ( );
/* iget-wide v3, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
(( java.text.NumberFormat ) v2 ).format ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ".Set the SafetySwitch property to false"; // const-string v2, ".Set the SafetySwitch property to false"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " if you\'re expecting column lengths greater than 100,000 characters to"; // const-string v2, " if you\'re expecting column lengths greater than 100,000 characters to"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " avoid this error."; // const-string v2, " avoid this error."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2b
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->updateCurrentValue()V */
int v5 = 1; // const/4 v5, 0x1
} // :cond_2c
if ( v4 != null) { // if-eqz v4, :cond_2f
/* add-int/lit8 v2, v2, 0x1 */
/* packed-switch v3, :pswitch_data_1 */
} // :cond_2d
} // :goto_d
/* if-nez v4, :cond_2e */
/* invoke-direct {p0, v1}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* goto/16 :goto_c */
/* :pswitch_4 */
/* mul-int/lit8 v1, v1, 0x10 */
/* int-to-char v1, v1 */
v6 = com.csvreader.CsvReader .hexToDec ( v0 );
/* add-int/2addr v1, v6 */
/* int-to-char v1, v1 */
int v6 = 4; // const/4 v6, 0x4
/* if-ne v2, v6, :cond_2d */
int v4 = 0; // const/4 v4, 0x0
/* :pswitch_5 */
/* mul-int/lit8 v1, v1, 0x8 */
/* int-to-char v1, v1 */
/* const/16 v6, 0x30 */
/* sub-int v6, v0, v6 */
/* int-to-char v6, v6 */
/* add-int/2addr v1, v6 */
/* int-to-char v1, v1 */
int v6 = 3; // const/4 v6, 0x3
/* if-ne v2, v6, :cond_2d */
int v4 = 0; // const/4 v4, 0x0
/* :pswitch_6 */
/* mul-int/lit8 v1, v1, 0xa */
/* int-to-char v1, v1 */
/* const/16 v6, 0x30 */
/* sub-int v6, v0, v6 */
/* int-to-char v6, v6 */
/* add-int/2addr v1, v6 */
/* int-to-char v1, v1 */
int v6 = 3; // const/4 v6, 0x3
/* if-ne v2, v6, :cond_2d */
int v4 = 0; // const/4 v4, 0x0
/* :pswitch_7 */
/* mul-int/lit8 v1, v1, 0x10 */
/* int-to-char v1, v1 */
v6 = com.csvreader.CsvReader .hexToDec ( v0 );
/* add-int/2addr v1, v6 */
/* int-to-char v1, v1 */
int v6 = 2; // const/4 v6, 0x2
/* if-ne v2, v6, :cond_2d */
int v4 = 0; // const/4 v4, 0x0
} // :cond_2e
v6 = this.dataBuffer;
v7 = this.dataBuffer;
/* iget v7, v7, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v7, v7, 0x1 */
/* iput v7, v6, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* goto/16 :goto_c */
} // :cond_2f
v6 = this.userSettings;
/* iget v6, v6, Lcom/csvreader/CsvReader$UserSettings;->EscapeMode:I */
int v7 = 2; // const/4 v7, 0x2
/* if-ne v6, v7, :cond_30 */
if ( v5 != null) { // if-eqz v5, :cond_30
/* sparse-switch v0, :sswitch_data_2 */
} // :goto_e
int v5 = 0; // const/4 v5, 0x0
/* goto/16 :goto_c */
/* :sswitch_e */
/* const/16 v5, 0xa */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_f */
/* const/16 v5, 0xd */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_10 */
/* const/16 v5, 0x9 */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_11 */
/* const/16 v5, 0x8 */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_12 */
/* const/16 v5, 0xc */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_13 */
/* const/16 v5, 0x1b */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_14 */
/* const/16 v5, 0xb */
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_15 */
int v5 = 7; // const/4 v5, 0x7
/* invoke-direct {p0, v5}, Lcom/csvreader/CsvReader;->appendLetter(C)V */
/* :sswitch_16 */
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
int v3 = 1; // const/4 v3, 0x1
/* const/16 v4, 0x30 */
/* sub-int v4, v0, v4 */
/* int-to-char v4, v4 */
v5 = this.dataBuffer;
v6 = this.dataBuffer;
/* iget v6, v6, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v6, v6, 0x1 */
/* iput v6, v5, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* move v11, v4 */
/* move v4, v2 */
/* move v2, v3 */
/* move v3, v1 */
/* move v1, v11 */
/* :sswitch_17 */
/* sparse-switch v0, :sswitch_data_3 */
/* move v1, v3 */
} // :goto_f
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
v5 = this.dataBuffer;
v6 = this.dataBuffer;
/* iget v6, v6, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v6, v6, 0x1 */
/* iput v6, v5, Lcom/csvreader/CsvReader$DataBuffer;->ColumnStart:I */
/* move v11, v4 */
/* move v4, v2 */
/* move v2, v3 */
/* move v3, v1 */
/* move v1, v11 */
/* :sswitch_18 */
int v1 = 1; // const/4 v1, 0x1
/* :sswitch_19 */
int v1 = 4; // const/4 v1, 0x4
/* :sswitch_1a */
int v1 = 2; // const/4 v1, 0x2
/* :sswitch_1b */
int v1 = 3; // const/4 v1, 0x3
} // :cond_30
v6 = this.userSettings;
/* iget-char v6, v6, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
/* if-ne v0, v6, :cond_31 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* goto/16 :goto_c */
} // :cond_31
/* iget-boolean v6, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
/* if-nez v6, :cond_32 */
/* const/16 v6, 0xd */
/* if-eq v0, v6, :cond_33 */
/* const/16 v6, 0xa */
/* if-eq v0, v6, :cond_33 */
} // :cond_32
/* iget-boolean v6, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
if ( v6 != null) { // if-eqz v6, :cond_2a
v6 = this.userSettings;
/* iget-char v6, v6, Lcom/csvreader/CsvReader$UserSettings;->RecordDelimiter:C */
/* if-ne v0, v6, :cond_2a */
} // :cond_33
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endColumn()V */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->endRecord()V */
/* goto/16 :goto_c */
} // :cond_34
/* new-instance v0, Ljava/lang/StringBuilder; */
/* new-instance v1, Ljava/lang/String; */
v2 = this.rawBuffer;
v2 = this.Buffer;
int v3 = 0; // const/4 v3, 0x0
v4 = this.rawBuffer;
/* iget v4, v4, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
/* invoke-direct {v1, v2, v3, v4}, Ljava/lang/String;-><init>([CII)V */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/String; */
v2 = this.dataBuffer;
v2 = this.Buffer;
v3 = this.dataBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
v4 = this.dataBuffer;
/* iget v4, v4, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v5 = this.dataBuffer;
/* iget v5, v5, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
/* sub-int/2addr v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* sub-int/2addr v4, v5 */
/* invoke-direct {v1, v2, v3, v4}, Ljava/lang/String;-><init>([CII)V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.rawRecord = v0;
/* goto/16 :goto_1 */
} // :cond_35
/* new-instance v0, Ljava/lang/String; */
v1 = this.rawBuffer;
v1 = this.Buffer;
int v2 = 0; // const/4 v2, 0x0
v3 = this.rawBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
/* invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V */
this.rawRecord = v0;
/* goto/16 :goto_1 */
} // :cond_36
final String v0 = ""; // const-string v0, ""
this.rawRecord = v0;
/* goto/16 :goto_1 */
} // :cond_37
/* move v11, v6 */
/* move v6, v0 */
/* move v0, v11 */
/* goto/16 :goto_a */
} // :cond_38
/* move v0, v6 */
/* goto/16 :goto_b */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x30 -> :sswitch_8 */
/* 0x31 -> :sswitch_8 */
/* 0x32 -> :sswitch_8 */
/* 0x33 -> :sswitch_8 */
/* 0x34 -> :sswitch_8 */
/* 0x35 -> :sswitch_8 */
/* 0x36 -> :sswitch_8 */
/* 0x37 -> :sswitch_8 */
/* 0x44 -> :sswitch_9 */
/* 0x4f -> :sswitch_9 */
/* 0x55 -> :sswitch_9 */
/* 0x58 -> :sswitch_9 */
/* 0x61 -> :sswitch_7 */
/* 0x62 -> :sswitch_3 */
/* 0x64 -> :sswitch_9 */
/* 0x65 -> :sswitch_5 */
/* 0x66 -> :sswitch_4 */
/* 0x6e -> :sswitch_0 */
/* 0x6f -> :sswitch_9 */
/* 0x72 -> :sswitch_1 */
/* 0x74 -> :sswitch_2 */
/* 0x75 -> :sswitch_9 */
/* 0x76 -> :sswitch_6 */
/* 0x78 -> :sswitch_9 */
} // .end sparse-switch
/* :sswitch_data_1 */
/* .sparse-switch */
/* 0x44 -> :sswitch_d */
/* 0x4f -> :sswitch_c */
/* 0x55 -> :sswitch_a */
/* 0x58 -> :sswitch_b */
/* 0x64 -> :sswitch_d */
/* 0x6f -> :sswitch_c */
/* 0x75 -> :sswitch_a */
/* 0x78 -> :sswitch_b */
} // .end sparse-switch
/* :pswitch_data_1 */
/* .packed-switch 0x1 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
} // .end packed-switch
/* :sswitch_data_2 */
/* .sparse-switch */
/* 0x30 -> :sswitch_16 */
/* 0x31 -> :sswitch_16 */
/* 0x32 -> :sswitch_16 */
/* 0x33 -> :sswitch_16 */
/* 0x34 -> :sswitch_16 */
/* 0x35 -> :sswitch_16 */
/* 0x36 -> :sswitch_16 */
/* 0x37 -> :sswitch_16 */
/* 0x44 -> :sswitch_17 */
/* 0x4f -> :sswitch_17 */
/* 0x55 -> :sswitch_17 */
/* 0x58 -> :sswitch_17 */
/* 0x61 -> :sswitch_15 */
/* 0x62 -> :sswitch_11 */
/* 0x64 -> :sswitch_17 */
/* 0x65 -> :sswitch_13 */
/* 0x66 -> :sswitch_12 */
/* 0x6e -> :sswitch_e */
/* 0x6f -> :sswitch_17 */
/* 0x72 -> :sswitch_f */
/* 0x74 -> :sswitch_10 */
/* 0x75 -> :sswitch_17 */
/* 0x76 -> :sswitch_14 */
/* 0x78 -> :sswitch_17 */
} // .end sparse-switch
/* :sswitch_data_3 */
/* .sparse-switch */
/* 0x44 -> :sswitch_1b */
/* 0x4f -> :sswitch_1a */
/* 0x55 -> :sswitch_18 */
/* 0x58 -> :sswitch_19 */
/* 0x64 -> :sswitch_1b */
/* 0x6f -> :sswitch_1a */
/* 0x75 -> :sswitch_18 */
/* 0x78 -> :sswitch_19 */
} // .end sparse-switch
} // .end method
public void setCaptureRawRecord ( Boolean p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-boolean p1, v0, Lcom/csvreader/CsvReader$UserSettings;->CaptureRawRecord:Z */
return;
} // .end method
public void setComment ( Object p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-char p1, v0, Lcom/csvreader/CsvReader$UserSettings;->Comment:C */
return;
} // .end method
public void setDelimiter ( Object p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-char p1, v0, Lcom/csvreader/CsvReader$UserSettings;->Delimiter:C */
return;
} // .end method
public void setEscapeMode ( Integer p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* if-eq p1, v0, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
/* if-eq p1, v0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Parameter escapeMode must be a valid value."; // const-string v1, "Parameter escapeMode must be a valid value."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.userSettings;
/* iput p1, v0, Lcom/csvreader/CsvReader$UserSettings;->EscapeMode:I */
return;
} // .end method
public void setHeaders ( java.lang.String[] p0 ) {
/* .locals 4 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.headersHolder;
this.Headers = p1;
v0 = this.headersHolder;
v0 = this.IndexByName;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.headersHolder;
/* array-length v1, p1 */
/* iput v1, v0, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
} // :goto_0
/* move v0, v2 */
} // :goto_1
v1 = this.headersHolder;
/* iget v1, v1, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
/* if-lt v0, v1, :cond_1 */
return;
} // :cond_0
v0 = this.headersHolder;
/* iput v2, v0, Lcom/csvreader/CsvReader$HeadersHolder;->Length:I */
} // :cond_1
v1 = this.headersHolder;
v1 = this.IndexByName;
/* aget-object v2, p1, v0 */
/* new-instance v3, Ljava/lang/Integer; */
/* invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void setRecordDelimiter ( Object p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/csvreader/CsvReader;->useCustomRecordDelimiter:Z */
v0 = this.userSettings;
/* iput-char p1, v0, Lcom/csvreader/CsvReader$UserSettings;->RecordDelimiter:C */
return;
} // .end method
public void setSafetySwitch ( Boolean p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-boolean p1, v0, Lcom/csvreader/CsvReader$UserSettings;->SafetySwitch:Z */
return;
} // .end method
public void setSkipEmptyRecords ( Boolean p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-boolean p1, v0, Lcom/csvreader/CsvReader$UserSettings;->SkipEmptyRecords:Z */
return;
} // .end method
public void setTextQualifier ( Object p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-char p1, v0, Lcom/csvreader/CsvReader$UserSettings;->TextQualifier:C */
return;
} // .end method
public void setTrimWhitespace ( Boolean p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-boolean p1, v0, Lcom/csvreader/CsvReader$UserSettings;->TrimWhitespace:Z */
return;
} // .end method
public void setUseComments ( Boolean p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-boolean p1, v0, Lcom/csvreader/CsvReader$UserSettings;->UseComments:Z */
return;
} // .end method
public void setUseTextQualifier ( Boolean p0 ) {
/* .locals 1 */
v0 = this.userSettings;
/* iput-boolean p1, v0, Lcom/csvreader/CsvReader$UserSettings;->UseTextQualifier:Z */
return;
} // .end method
public Boolean skipLine ( ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
/* iput v4, p0, Lcom/csvreader/CsvReader;->columnsCount:I */
/* iget-boolean v0, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
/* move v0, v4 */
/* move v1, v4 */
} // :cond_0
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
v3 = this.dataBuffer;
/* iget v3, v3, Lcom/csvreader/CsvReader$DataBuffer;->Count:I */
/* if-ne v2, v3, :cond_2 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkDataLength()V */
} // :goto_0
/* iget-boolean v2, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_1
v0 = this.columnBuffer;
/* iput v4, v0, Lcom/csvreader/CsvReader$ColumnBuffer;->Position:I */
v0 = this.dataBuffer;
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, v0, Lcom/csvreader/CsvReader$DataBuffer;->LineStart:I */
/* move v0, v1 */
} // :goto_1
v1 = this.rawBuffer;
/* iput v4, v1, Lcom/csvreader/CsvReader$RawRecordBuffer;->Position:I */
final String v1 = ""; // const-string v1, ""
this.rawRecord = v1;
} // :cond_2
v1 = this.dataBuffer;
v1 = this.Buffer;
v2 = this.dataBuffer;
/* iget v2, v2, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* aget-char v1, v1, v2 */
/* const/16 v2, 0xd */
/* if-eq v1, v2, :cond_3 */
/* const/16 v2, 0xa */
/* if-ne v1, v2, :cond_4 */
} // :cond_3
/* move v0, v5 */
} // :cond_4
/* iput-char v1, p0, Lcom/csvreader/CsvReader;->lastLetter:C */
/* if-nez v0, :cond_5 */
v1 = this.dataBuffer;
/* iget v2, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, v1, Lcom/csvreader/CsvReader$DataBuffer;->Position:I */
} // :cond_5
/* move v1, v5 */
} // :cond_6
/* move v0, v4 */
} // .end method
public Boolean skipRecord ( ) {
/* .locals 5 */
/* invoke-direct {p0}, Lcom/csvreader/CsvReader;->checkClosed()V */
int v0 = 0; // const/4 v0, 0x0
/* iget-boolean v1, p0, Lcom/csvreader/CsvReader;->hasMoreData:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = (( com.csvreader.CsvReader ) p0 ).readRecord ( ); // invoke-virtual {p0}, Lcom/csvreader/CsvReader;->readRecord()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-wide v1, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
/* const-wide/16 v3, 0x1 */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Lcom/csvreader/CsvReader;->currentRecord:J */
} // :cond_0
} // .end method
