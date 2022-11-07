public class zongfuscated.k {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # direct methods */
	 static zongfuscated.k ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lzongfuscated/k; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public zongfuscated.k ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static zongfuscated.B a ( java.io.InputStream p0 ) {
		 /* .locals 7 */
		 /* new-instance v0, Lzongfuscated/B; */
		 /* invoke-direct {v0}, Lzongfuscated/B;-><init>()V */
		 /* new-instance v1, Ljava/util/ArrayList; */
		 /* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
		 (( zongfuscated.B ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lzongfuscated/B;->a(Ljava/util/ArrayList;)V
		 /* new-instance v1, Landroid/sax/RootElement; */
		 final String v2 = "ZgRespond"; // const-string v2, "ZgRespond"
		 /* invoke-direct {v1, v2}, Landroid/sax/RootElement;-><init>(Ljava/lang/String;)V */
		 final String v2 = "actions"; // const-string v2, "actions"
		 (( android.sax.RootElement ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
		 final String v3 = "view"; // const-string v3, "view"
		 (( android.sax.RootElement ) v1 ).getChild ( v3 ); // invoke-virtual {v1, v3}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
		 final String v4 = "action"; // const-string v4, "action"
		 (( android.sax.Element ) v2 ).getChild ( v4 ); // invoke-virtual {v2, v4}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
		 final String v4 = "message"; // const-string v4, "message"
		 (( android.sax.Element ) v2 ).getChild ( v4 ); // invoke-virtual {v2, v4}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
		 final String v5 = "params"; // const-string v5, "params"
		 (( android.sax.Element ) v2 ).getChild ( v5 ); // invoke-virtual {v2, v5}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
		 /* new-instance v6, Lzongfuscated/k$3; */
		 /* invoke-direct {v6, v0}, Lzongfuscated/k$3;-><init>(Lzongfuscated/B;)V */
		 (( android.sax.Element ) v2 ).setStartElementListener ( v6 ); // invoke-virtual {v2, v6}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
		 /* new-instance v2, Lzongfuscated/k$4; */
		 /* invoke-direct {v2, v0}, Lzongfuscated/k$4;-><init>(Lzongfuscated/B;)V */
		 (( android.sax.Element ) v4 ).setEndTextElementListener ( v2 ); // invoke-virtual {v4, v2}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
		 final String v2 = "param"; // const-string v2, "param"
		 (( android.sax.Element ) v5 ).getChild ( v2 ); // invoke-virtual {v5, v2}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
		 /* new-instance v4, Lzongfuscated/k$1; */
		 /* invoke-direct {v4, v0}, Lzongfuscated/k$1;-><init>(Lzongfuscated/B;)V */
		 (( android.sax.Element ) v2 ).setStartElementListener ( v4 ); // invoke-virtual {v2, v4}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
		 /* new-instance v2, Lzongfuscated/k$2; */
		 /* invoke-direct {v2, v0}, Lzongfuscated/k$2;-><init>(Lzongfuscated/B;)V */
		 (( android.sax.Element ) v3 ).setEndTextElementListener ( v2 ); // invoke-virtual {v3, v2}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
		 try { // :try_start_0
			 v2 = android.util.Xml$Encoding.UTF_8;
			 (( android.sax.RootElement ) v1 ).getContentHandler ( ); // invoke-virtual {v1}, Landroid/sax/RootElement;->getContentHandler()Lorg/xml/sax/ContentHandler;
			 android.util.Xml .parse ( p0,v2,v1 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 v1 = zongfuscated.k.a;
		 final String v2 = "Parse"; // const-string v2, "Parse"
		 zongfuscated.q .a ( v1,v2,v0 );
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
