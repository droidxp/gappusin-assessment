class com.balloonisland.hfxw.Utility$FlushedInputStream extends java.io.FilterInputStream {
	 /* .source "Utility.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/balloonisland/hfxw/Utility; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "FlushedInputStream" */
} // .end annotation
/* # direct methods */
public com.balloonisland.hfxw.Utility$FlushedInputStream ( ) {
/* .locals 0 */
/* .param p1, "inputStream" # Ljava/io/InputStream; */
/* .prologue */
/* .line 63 */
/* invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 64 */
return;
} // .end method
/* # virtual methods */
public Long skip ( Long p0 ) {
/* .locals 8 */
/* .param p1, "n" # J */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 68 */
/* const-wide/16 v3, 0x0 */
/* .line 69 */
/* .local v3, "totalBytesSkipped":J */
} // :goto_0
/* cmp-long v5, v3, p1 */
/* if-ltz v5, :cond_1 */
/* .line 81 */
} // :cond_0
/* return-wide v3 */
/* .line 70 */
} // :cond_1
v5 = this.in;
/* sub-long v6, p1, v3 */
(( java.io.InputStream ) v5 ).skip ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/io/InputStream;->skip(J)J
/* move-result-wide v1 */
/* .line 71 */
/* .local v1, "bytesSkipped":J */
/* const-wide/16 v5, 0x0 */
/* cmp-long v5, v1, v5 */
/* if-nez v5, :cond_2 */
/* .line 72 */
v0 = (( com.balloonisland.hfxw.Utility$FlushedInputStream ) p0 ).read ( ); // invoke-virtual {p0}, Lcom/balloonisland/hfxw/Utility$FlushedInputStream;->read()I
/* .line 73 */
/* .local v0, "b":I */
/* if-ltz v0, :cond_0 */
/* .line 76 */
/* const-wide/16 v1, 0x1 */
/* .line 79 */
} // .end local v0 # "b":I
} // :cond_2
/* add-long/2addr v3, v1 */
} // .end method
