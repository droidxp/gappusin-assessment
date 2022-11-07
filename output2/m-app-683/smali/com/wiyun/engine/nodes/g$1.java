class com.wiyun.engine.nodes.g$1 extends java.lang.Thread {
	 /* .source "_A.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/g;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.nodes.g a; //synthetic
private final android.content.Intent b; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.g$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.a = p1;
this.b = p2;
/* .line 1822 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 1825 */
try { // :try_start_0
	 v4 = this.b;
	 (( android.content.Intent ) v4 ).getData ( ); // invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;
	 (( android.net.Uri ) v4 ).getSchemeSpecificPart ( ); // invoke-virtual {v4}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;
	 /* .line 1826 */
	 /* .local v2, "pkg":Ljava/lang/String; */
	 v3 = 	 com.wiyun.engine.nodes.d .f ( );
	 /* .line 1827 */
	 /* .local v3, "size":I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .local v0, "i":I */
} // :goto_0
/* if-lt v0, v3, :cond_0 */
/* .line 1838 */
} // .end local v0 # "i":I
} // .end local v2 # "pkg":Ljava/lang/String;
} // .end local v3 # "size":I
} // :goto_1
return;
/* .line 1828 */
/* .restart local v0 # "i":I */
/* .restart local v2 # "pkg":Ljava/lang/String; */
/* .restart local v3 # "size":I */
} // :cond_0
com.wiyun.engine.nodes.d .f ( );
/* check-cast v1, Lcom/wiyun/engine/nodes/d$a; */
/* .line 1829 */
/* .local v1, "pip":Lcom/wiyun/engine/nodes/d$a; */
v4 = this.a;
v4 = (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 1830 */
com.wiyun.engine.nodes.d .f ( );
/* .line 1831 */
com.wiyun.engine.nodes.b .a ( v2 );
/* .line 1832 */
v4 = this.b;
com.wiyun.engine.nodes.d .a ( v2,v4 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1836 */
} // .end local v0 # "i":I
} // .end local v1 # "pip":Lcom/wiyun/engine/nodes/d$a;
} // .end local v2 # "pkg":Ljava/lang/String;
} // .end local v3 # "size":I
/* :catch_0 */
/* move-exception v4 */
/* .line 1827 */
/* .restart local v0 # "i":I */
/* .restart local v1 # "pip":Lcom/wiyun/engine/nodes/d$a; */
/* .restart local v2 # "pkg":Ljava/lang/String; */
/* .restart local v3 # "size":I */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
