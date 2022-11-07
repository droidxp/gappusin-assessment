class com.nvidia.devtech.NvGLESActivity$1$2 implements java.lang.Runnable {
	 /* .source "NvGLESActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nvidia/devtech/NvGLESActivity$1;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
Integer count;
Long start;
final com.nvidia.devtech.NvGLESActivity$1 this$1; //synthetic
Long timeStart;
/* # direct methods */
 com.nvidia.devtech.NvGLESActivity$1$2 ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* .line 284 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 286 */
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( p1 );
(( com.nvidia.devtech.NvGLESActivity ) v0 ).nvGetSystemTime ( ); // invoke-virtual {v0}, Lcom/nvidia/devtech/NvGLESActivity;->nvGetSystemTime()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->timeStart:J */
/* .line 287 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->count:I */
/* .line 288 */
/* const-wide/16 v0, -0x1 */
/* iput-wide v0, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->start:J */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 11 */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
int v10 = 0; // const/4 v10, 0x0
/* .line 291 */
/* iget-wide v3, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->start:J */
/* const-wide/16 v5, -0x1 */
/* cmp-long v3, v3, v5 */
/* if-nez v3, :cond_0 */
/* .line 292 */
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
(( com.nvidia.devtech.NvGLESActivity ) v3 ).nvGetSystemTime ( ); // invoke-virtual {v3}, Lcom/nvidia/devtech/NvGLESActivity;->nvGetSystemTime()J
/* move-result-wide v3 */
/* iput-wide v3, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->start:J */
/* .line 293 */
} // :cond_0
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
(( com.nvidia.devtech.NvGLESActivity ) v3 ).nvGetSystemTime ( ); // invoke-virtual {v3}, Lcom/nvidia/devtech/NvGLESActivity;->nvGetSystemTime()J
/* move-result-wide v3 */
/* iget-wide v5, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->start:J */
/* sub-long/2addr v3, v5 */
/* long-to-float v3, v3 */
/* const v4, 0x3a83126f # 0.001f */
/* mul-float v2, v3, v4 */
/* .line 294 */
/* .local v2, "time":F */
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
v4 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v4 );
v4 = com.nvidia.devtech.NvGLESActivity .access$1 ( v4 );
v5 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v5 );
v5 = com.nvidia.devtech.NvGLESActivity .access$2 ( v5 );
v3 = (( com.nvidia.devtech.NvGLESActivity ) v3 ).render ( v2, v4, v5, v7 ); // invoke-virtual {v3, v2, v4, v5, v7}, Lcom/nvidia/devtech/NvGLESActivity;->render(FIIZ)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 295 */
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
(( com.nvidia.devtech.NvGLESActivity ) v3 ).swap ( ); // invoke-virtual {v3}, Lcom/nvidia/devtech/NvGLESActivity;->swap()V
/* .line 296 */
} // :cond_1
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
v3 = com.nvidia.devtech.NvGLESActivity .access$3 ( v3 );
/* if-nez v3, :cond_2 */
/* .line 297 */
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
v3 = this.handler;
(( android.os.Handler ) v3 ).post ( p0 ); // invoke-virtual {v3, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 299 */
} // :cond_2
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
com.nvidia.devtech.NvGLESActivity .access$4 ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_3
/* iget v3, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->count:I */
/* add-int/lit8 v3, v3, 0x1 */
/* iput v3, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->count:I */
/* const/16 v4, 0x64 */
/* if-ne v3, v4, :cond_3 */
/* .line 301 */
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
(( com.nvidia.devtech.NvGLESActivity ) v3 ).nvGetSystemTime ( ); // invoke-virtual {v3}, Lcom/nvidia/devtech/NvGLESActivity;->nvGetSystemTime()J
/* move-result-wide v0 */
/* .line 302 */
/* .local v0, "end":J */
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
com.nvidia.devtech.NvGLESActivity .access$4 ( v3 );
final String v4 = "%.2f fps"; // const-string v4, "%.2f fps"
/* new-array v5, v7, [Ljava/lang/Object; */
/* const-wide v6, 0x40f86a0000000000L # 100000.0 */
/* iget-wide v8, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->timeStart:J */
/* sub-long v8, v0, v8 */
/* long-to-double v8, v8 */
/* div-double/2addr v6, v8 */
java.lang.Double .valueOf ( v6,v7 );
/* aput-object v6, v5, v10 */
java.lang.String .format ( v4,v5 );
(( android.widget.TextView ) v3 ).setText ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 303 */
v3 = this.this$1;
com.nvidia.devtech.NvGLESActivity$1 .access$0 ( v3 );
(( com.nvidia.devtech.NvGLESActivity ) v3 ).nvGetSystemTime ( ); // invoke-virtual {v3}, Lcom/nvidia/devtech/NvGLESActivity;->nvGetSystemTime()J
/* move-result-wide v3 */
/* iput-wide v3, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->timeStart:J */
/* .line 304 */
/* iput v10, p0, Lcom/nvidia/devtech/NvGLESActivity$1$2;->count:I */
/* .line 306 */
} // .end local v0 # "end":J
} // :cond_3
return;
} // .end method
