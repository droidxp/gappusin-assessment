public class de.hellowins.LogData {
	 /* .source "LogData.java" */
	 /* # instance fields */
	 Boolean debugMode;
	 protected java.lang.String log;
	 /* # direct methods */
	 public de.hellowins.LogData ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 11 */
		 final String v0 = ""; // const-string v0, ""
		 this.log = v0;
		 /* .line 13 */
		 return;
	 } // .end method
	 public de.hellowins.LogData ( ) {
		 /* .locals 1 */
		 /* .param p1, "debugMode" # Z */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 11 */
		 final String v0 = ""; // const-string v0, ""
		 this.log = v0;
		 /* .line 16 */
		 /* iput-boolean p1, p0, Lde/hellowins/LogData;->debugMode:Z */
		 /* .line 17 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addLog ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p1, "logString" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 30 */
		 /* iget-boolean v0, p0, Lde/hellowins/LogData;->debugMode:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 31 */
			 v0 = this.log;
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 java.lang.String .valueOf ( v0 );
			 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v1 = "\r\n"; // const-string v1, "\r\n"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 this.log = v0;
			 /* .line 33 */
		 } // :cond_0
		 return;
	 } // .end method
	 public void clear ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 51 */
		 final String v0 = ""; // const-string v0, ""
		 this.log = v0;
		 /* .line 52 */
		 return;
	 } // .end method
	 public java.lang.String getLog ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 47 */
		 v0 = this.log;
	 } // .end method
	 public void logException ( java.lang.Exception p0 ) {
		 /* .locals 5 */
		 /* .param p1, "e" # Ljava/lang/Exception; */
		 /* .prologue */
		 /* .line 37 */
		 try { // :try_start_0
			 /* new-instance v2, Ljava/io/StringWriter; */
			 /* invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V */
			 /* .line 38 */
			 /* .local v2, "result":Ljava/io/Writer; */
			 /* new-instance v1, Ljava/io/PrintWriter; */
			 /* invoke-direct {v1, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V */
			 /* .line 39 */
			 /* .local v1, "printWriter":Ljava/io/PrintWriter; */
			 (( java.lang.Exception ) p1 ).printStackTrace ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V
			 /* .line 40 */
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 final String v4 = "Error: "; // const-string v4, "Error: "
			 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( de.hellowins.LogData ) p0 ).addLog ( v3 ); // invoke-virtual {p0, v3}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 44 */
		 } // .end local v1 # "printWriter":Ljava/io/PrintWriter;
	 } // .end local v2 # "result":Ljava/io/Writer;
} // :goto_0
return;
/* .line 41 */
/* :catch_0 */
/* move-exception v0 */
/* .line 42 */
/* .local v0, "e1":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void setDebugMode ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "debugMode" # Z */
/* .prologue */
/* .line 25 */
/* iput-boolean p1, p0, Lde/hellowins/LogData;->debugMode:Z */
/* .line 26 */
return;
} // .end method
