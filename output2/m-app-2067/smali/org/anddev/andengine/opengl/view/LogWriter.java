class org.anddev.andengine.opengl.view.LogWriter extends java.io.Writer {
	 /* # instance fields */
	 private final java.lang.StringBuilder mBuilder;
	 /* # direct methods */
	 org.anddev.andengine.opengl.view.LogWriter ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/io/Writer;-><init>()V */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 this.mBuilder = v0;
		 return;
	 } // .end method
	 private void flushBuilder ( ) {
		 /* .locals 3 */
		 v0 = this.mBuilder;
		 v0 = 		 (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
		 /* if-lez v0, :cond_0 */
		 final String v0 = "GLSurfaceView"; // const-string v0, "GLSurfaceView"
		 v1 = this.mBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .v ( v0,v1 );
		 v0 = this.mBuilder;
		 int v1 = 0; // const/4 v1, 0x0
		 v2 = this.mBuilder;
		 v2 = 		 (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
		 (( java.lang.StringBuilder ) v0 ).delete ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public void close ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/opengl/view/LogWriter;->flushBuilder()V */
	 return;
} // .end method
public void flush ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/opengl/view/LogWriter;->flushBuilder()V */
	 return;
} // .end method
public void write ( Object[] p0, Integer p1, Integer p2 ) {
	 /* .locals 3 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lt v0, p3, :cond_0 */
return;
} // :cond_0
/* add-int v1, p2, v0 */
/* aget-char v1, p1, v1 */
/* const/16 v2, 0xa */
/* if-ne v1, v2, :cond_1 */
/* invoke-direct {p0}, Lorg/anddev/andengine/opengl/view/LogWriter;->flushBuilder()V */
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
v2 = this.mBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // .end method
