public class com.umeng.common.Log {
	 /* .source "Log.java" */
	 /* # static fields */
	 public static Boolean LOG;
	 /* # direct methods */
	 static com.umeng.common.Log ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.umeng.common.Log.LOG = (v0!= 0);
		 return;
	 } // .end method
	 public com.umeng.common.Log ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 17 */
		 /* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 18 */
			 android.util.Log .i ( p0,p1 );
			 /* .line 20 */
		 } // :cond_0
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1, java.lang.Exception p2 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 23 */
		 /* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 24 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 (( java.lang.Exception ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;
			 java.lang.String .valueOf ( v1 );
			 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 final String v1 = ": ["; // const-string v1, ": ["
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v1 = "]"; // const-string v1, "]"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .i ( p0,v0 );
			 /* .line 26 */
		 } // :cond_0
		 return;
	 } // .end method
	 public static void b ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 /* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 30 */
			 android.util.Log .e ( p0,p1 );
			 /* .line 32 */
		 } // :cond_0
		 return;
	 } // .end method
	 public static void b ( java.lang.String p0, java.lang.String p1, java.lang.Exception p2 ) {
		 /* .locals 6 */
		 /* .prologue */
		 /* .line 35 */
		 /* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 36 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 (( java.lang.Exception ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;
			 java.lang.String .valueOf ( v1 );
			 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 final String v1 = ": ["; // const-string v1, ": ["
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v1 = "]"; // const-string v1, "]"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .e ( p0,v0 );
			 /* .line 37 */
			 (( java.lang.Exception ) p2 ).getStackTrace ( ); // invoke-virtual {p2}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;
			 /* .line 38 */
			 /* array-length v2, v1 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
		 /* if-lt v0, v2, :cond_1 */
		 /* .line 41 */
	 } // :cond_0
	 return;
	 /* .line 38 */
} // :cond_1
/* aget-object v3, v1, v0 */
/* .line 39 */
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = " at\t "; // const-string v5, " at\t "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StackTraceElement ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( p0,v3 );
/* .line 38 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static void c ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 44 */
/* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 45 */
	 android.util.Log .d ( p0,p1 );
	 /* .line 47 */
} // :cond_0
return;
} // .end method
public static void c ( java.lang.String p0, java.lang.String p1, java.lang.Exception p2 ) {
/* .locals 2 */
/* .prologue */
/* .line 50 */
/* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 51 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 (( java.lang.Exception ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = ": ["; // const-string v1, ": ["
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = "]"; // const-string v1, "]"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( p0,v0 );
	 /* .line 53 */
} // :cond_0
return;
} // .end method
public static void d ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 56 */
/* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 57 */
	 android.util.Log .v ( p0,p1 );
	 /* .line 59 */
} // :cond_0
return;
} // .end method
public static void d ( java.lang.String p0, java.lang.String p1, java.lang.Exception p2 ) {
/* .locals 2 */
/* .prologue */
/* .line 62 */
/* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 63 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 (( java.lang.Exception ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = ": ["; // const-string v1, ": ["
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = "]"; // const-string v1, "]"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .v ( p0,v0 );
	 /* .line 65 */
} // :cond_0
return;
} // .end method
public static void e ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 68 */
/* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 69 */
	 android.util.Log .w ( p0,p1 );
	 /* .line 71 */
} // :cond_0
return;
} // .end method
public static void e ( java.lang.String p0, java.lang.String p1, java.lang.Exception p2 ) {
/* .locals 6 */
/* .prologue */
/* .line 74 */
/* sget-boolean v0, Lcom/umeng/common/Log;->LOG:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 75 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 (( java.lang.Exception ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = ": ["; // const-string v1, ": ["
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = "]"; // const-string v1, "]"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( p0,v0 );
	 /* .line 76 */
	 (( java.lang.Exception ) p2 ).getStackTrace ( ); // invoke-virtual {p2}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;
	 /* .line 77 */
	 /* array-length v2, v1 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lt v0, v2, :cond_1 */
/* .line 80 */
} // :cond_0
return;
/* .line 77 */
} // :cond_1
/* aget-object v3, v1, v0 */
/* .line 78 */
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = " at\t "; // const-string v5, " at\t "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StackTraceElement ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( p0,v3 );
/* .line 77 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
