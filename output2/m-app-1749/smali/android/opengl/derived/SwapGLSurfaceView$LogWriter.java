class android.opengl.derived.SwapGLSurfaceView$LogWriter extends java.io.Writer {
	 /* .source "SwapGLSurfaceView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/opengl/derived/SwapGLSurfaceView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "LogWriter" */
} // .end annotation
/* # instance fields */
private java.lang.StringBuilder mBuilder;
/* # direct methods */
 android.opengl.derived.SwapGLSurfaceView$LogWriter ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1129 */
/* invoke-direct {p0}, Ljava/io/Writer;-><init>()V */
/* .line 1158 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
this.mBuilder = v0;
return;
} // .end method
private void flushBuilder ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1152 */
v0 = this.mBuilder;
v0 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* if-lez v0, :cond_0 */
/* .line 1153 */
final String v0 = "GLSurfaceView"; // const-string v0, "GLSurfaceView"
v1 = this.mBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 1154 */
v0 = this.mBuilder;
int v1 = 0; // const/4 v1, 0x0
v2 = this.mBuilder;
v2 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
(( java.lang.StringBuilder ) v0 ).delete ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
/* .line 1156 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1132 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$LogWriter;->flushBuilder()V */
/* .line 1133 */
return;
} // .end method
public void flush ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1136 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$LogWriter;->flushBuilder()V */
/* .line 1137 */
return;
} // .end method
public void write ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "buf" # [C */
/* .param p2, "offset" # I */
/* .param p3, "count" # I */
/* .prologue */
/* .line 1140 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-ge v1, p3, :cond_1 */
/* .line 1141 */
/* add-int v2, p2, v1 */
/* aget-char v0, p1, v2 */
/* .line 1142 */
/* .local v0, "c":C */
/* const/16 v2, 0xa */
/* if-ne v0, v2, :cond_0 */
/* .line 1143 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$LogWriter;->flushBuilder()V */
/* .line 1140 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 1146 */
} // :cond_0
v2 = this.mBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 1149 */
} // .end local v0 # "c":C
} // :cond_1
return;
} // .end method
