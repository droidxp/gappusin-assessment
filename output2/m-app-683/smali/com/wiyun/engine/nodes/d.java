class com.wiyun.engine.nodes.d {
	 /* .source "_A.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/d$b;, */
	 /* Lcom/wiyun/engine/nodes/d$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static java.lang.String a;
private static java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.util.List d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/wiyun/engine/nodes/d$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.lang.String e;
private static java.lang.String f;
private static java.lang.String g;
private static java.lang.String h;
private static java.lang.String i;
private static java.io.File j;
private static java.io.File k;
private static java.io.File l;
private static java.io.File m;
private static Boolean n;
private static Integer o;
private static Integer p;
private static Integer q;
private static Boolean r;
private static Boolean s;
private static android.os.Handler t;
private static android.content.BroadcastReceiver u;
private static android.content.BroadcastReceiver v;
/* # direct methods */
static com.wiyun.engine.nodes.d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1563 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 1568 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 1573 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 1744 */
final String v0 = "last_req"; // const-string v0, "last_req"
/* .line 1749 */
final String v0 = "last_dreq"; // const-string v0, "last_dreq"
/* .line 1754 */
final String v0 = "ri"; // const-string v0, "ri"
/* .line 1759 */
final String v0 = "dn"; // const-string v0, "dn"
/* .line 1801 */
/* new-instance v0, Lcom/wiyun/engine/nodes/a; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/a;-><init>()V */
/* .line 1819 */
/* new-instance v0, Lcom/wiyun/engine/nodes/g; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/g;-><init>()V */
/* .line 1525 */
return;
} // .end method
 com.wiyun.engine.nodes.d ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1525 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private static android.view.View a ( android.view.WindowManager p0, android.content.Context p1, android.content.Intent p2 ) {
/* .locals 9 */
/* .prologue */
int v4 = 5; // const/4 v4, 0x5
int v8 = 1; // const/4 v8, 0x1
int v7 = 0; // const/4 v7, 0x0
int v6 = -1; // const/4 v6, -0x1
int v5 = -2; // const/4 v5, -0x2
/* .line 1950 */
/* new-instance v0, Landroid/widget/LinearLayout; */
/* invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 1951 */
(( android.widget.LinearLayout ) v0 ).setOrientation ( v8 ); // invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 1954 */
/* new-instance v1, Landroid/widget/LinearLayout; */
/* invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 1955 */
/* const v2, -0xcbaa87 */
(( android.widget.LinearLayout ) v1 ).setBackgroundColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
/* .line 1956 */
(( android.widget.LinearLayout ) v1 ).setOrientation ( v7 ); // invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 1957 */
/* const/16 v2, 0x10 */
(( android.widget.LinearLayout ) v1 ).setGravity ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 1958 */
/* new-instance v2, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v2, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 1959 */
int v3 = 2; // const/4 v3, 0x2
(( android.widget.LinearLayout ) v1 ).setPadding ( v4, v4, v4, v3 ); // invoke-virtual {v1, v4, v4, v4, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V
/* .line 1960 */
(( android.widget.LinearLayout ) v0 ).addView ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 1963 */
/* new-instance v2, Landroid/widget/Button; */
/* invoke-direct {v2, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V */
/* .line 1964 */
final String v3 = "Close"; // const-string v3, "Close"
(( android.widget.Button ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 1965 */
/* new-instance v3, Lcom/wiyun/engine/nodes/d$2; */
/* invoke-direct {v3, p0, v0}, Lcom/wiyun/engine/nodes/d$2;-><init>(Landroid/view/WindowManager;Landroid/widget/LinearLayout;)V */
(( android.widget.Button ) v2 ).setOnClickListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 1971 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v3, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 1972 */
(( android.widget.LinearLayout ) v1 ).addView ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 1975 */
/* new-instance v2, Landroid/widget/TextView; */
/* invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
/* .line 1976 */
/* const v3, 0x1030044 */
(( android.widget.TextView ) v2 ).setTextAppearance ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
/* .line 1977 */
final String v3 = "title"; // const-string v3, "title"
(( android.content.Intent ) p2 ).getStringExtra ( v3 ); // invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 1978 */
/* const/16 v3, 0x11 */
(( android.widget.TextView ) v2 ).setGravity ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V
/* .line 1979 */
(( android.widget.TextView ) v2 ).setSingleLine ( v8 ); // invoke-virtual {v2, v8}, Landroid/widget/TextView;->setSingleLine(Z)V
/* .line 1980 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v3, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 1981 */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F */
/* .line 1982 */
/* const/high16 v4, 0x40a00000 # 5.0f */
v4 = com.wiyun.engine.nodes._U .a ( v4 );
/* float-to-int v4, v4 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I */
/* .line 1983 */
(( android.widget.LinearLayout ) v1 ).addView ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 1986 */
/* new-instance v2, Landroid/widget/ProgressBar; */
/* invoke-direct {v2, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V */
/* .line 1987 */
(( android.widget.ProgressBar ) v2 ).setIndeterminate ( v8 ); // invoke-virtual {v2, v8}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V
/* .line 1988 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v3, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 1989 */
/* const/high16 v4, 0x41880000 # 17.0f */
v4 = com.wiyun.engine.nodes._U .a ( v4 );
/* float-to-int v4, v4 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I */
/* .line 1990 */
(( android.widget.LinearLayout ) v1 ).addView ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 1991 */
(( android.widget.ProgressBar ) v2 ).setVisibility ( v7 ); // invoke-virtual {v2, v7}, Landroid/widget/ProgressBar;->setVisibility(I)V
/* .line 1994 */
/* new-instance v1, Landroid/webkit/WebView; */
/* invoke-direct {v1, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* .line 1995 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v3, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 1996 */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F */
/* .line 1997 */
(( android.widget.LinearLayout ) v0 ).addView ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 2000 */
/* const/high16 v3, 0x2000000 */
(( android.webkit.WebView ) v1 ).setScrollBarStyle ( v3 ); // invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
/* .line 2001 */
(( android.webkit.WebView ) v1 ).setMapTrackballToArrowKeys ( v7 ); // invoke-virtual {v1, v7}, Landroid/webkit/WebView;->setMapTrackballToArrowKeys(Z)V
/* .line 2002 */
(( android.webkit.WebView ) v1 ).getSettings ( ); // invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v3 ).setJavaScriptEnabled ( v8 ); // invoke-virtual {v3, v8}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 2003 */
(( android.webkit.WebView ) v1 ).getSettings ( ); // invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v3 ).setBuiltInZoomControls ( v7 ); // invoke-virtual {v3, v7}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
/* .line 2004 */
/* new-instance v3, Lcom/wiyun/engine/nodes/d$3; */
/* invoke-direct {v3, v2, v1}, Lcom/wiyun/engine/nodes/d$3;-><init>(Landroid/widget/ProgressBar;Landroid/webkit/WebView;)V */
(( android.webkit.WebView ) v1 ).setWebViewClient ( v3 ); // invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 2023 */
final String v2 = "data_uri"; // const-string v2, "data_uri"
(( android.content.Intent ) p2 ).getStringExtra ( v2 ); // invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( android.webkit.WebView ) v1 ).loadUrl ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 2025 */
} // .end method
static java.lang.String a ( org.apache.http.HttpEntity p0 ) {
/* .locals 6 */
/* .param p0, "entity" # Lorg/apache/http/HttpEntity; */
/* .prologue */
/* .line 3066 */
try { // :try_start_0
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 3067 */
/* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
/* const/16 v5, 0x800 */
/* new-array v1, v5, [B */
/* .line 3068 */
/* .local v1, "buf":[B */
/* .line 3069 */
/* .local v4, "is":Ljava/io/InputStream; */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
int v5 = -1; // const/4 v5, -0x1
/* if-ne v3, v5, :cond_0 */
/* .line 3071 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
com.wiyun.engine.nodes._U .a ( v5 );
/* .line 3073 */
} // .end local v0 # "baos":Ljava/io/ByteArrayOutputStream;
} // .end local v1 # "buf":[B
} // .end local v3 # "i":I
} // .end local v4 # "is":Ljava/io/InputStream;
} // :goto_1
/* .line 3070 */
/* .restart local v0 # "baos":Ljava/io/ByteArrayOutputStream; */
/* .restart local v1 # "buf":[B */
/* .restart local v3 # "i":I */
/* .restart local v4 # "is":Ljava/io/InputStream; */
} // :cond_0
int v5 = 0; // const/4 v5, 0x0
(( java.io.ByteArrayOutputStream ) v0 ).write ( v1, v5, v3 ); // invoke-virtual {v0, v1, v5, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 3069 */
(( java.io.InputStream ) v4 ).read ( v1 ); // invoke-virtual {v4, v1}, Ljava/io/InputStream;->read([B)I
/* :try_end_0 */
v3 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3072 */
} // .end local v0 # "baos":Ljava/io/ByteArrayOutputStream;
} // .end local v1 # "buf":[B
} // .end local v3 # "i":I
} // .end local v4 # "is":Ljava/io/InputStream;
/* :catch_0 */
/* move-exception v2 */
/* .line 3073 */
/* .local v2, "e":Ljava/lang/Exception; */
final String v5 = ""; // const-string v5, ""
} // .end method
public static synchronized void a ( ) {
/* .locals 6 */
/* .prologue */
/* .line 2032 */
/* const-class v1, Lcom/wiyun/engine/nodes/d; */
/* monitor-enter v1 */
try { // :try_start_0
/* sget-boolean v0, Lcom/wiyun/engine/nodes/d;->n:Z */
/* if-nez v0, :cond_1 */
/* .line 2033 */
int v0 = 1; // const/4 v0, 0x1
com.wiyun.engine.nodes.d.n = (v0!= 0);
/* .line 2035 */
v0 = com.wiyun.engine.nodes.d.t;
/* if-nez v0, :cond_0 */
/* .line 2036 */
/* new-instance v0, Lcom/wiyun/engine/nodes/d$4; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v0, v2}, Lcom/wiyun/engine/nodes/d$4;-><init>(Landroid/os/Looper;)V */
/* .line 2054 */
} // :cond_0
/* new-instance v0, Landroid/content/IntentFilter; */
final String v2 = "com.wiyun.hsup.DOWNLOAD_APP"; // const-string v2, "com.wiyun.hsup.DOWNLOAD_APP"
/* invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
/* .line 2055 */
final String v2 = "com.wiyun.hsup.FORWARD_INTENT"; // const-string v2, "com.wiyun.hsup.FORWARD_INTENT"
(( android.content.IntentFilter ) v0 ).addAction ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 2056 */
final String v2 = "com.wiyun.hsup.DOWNLOAD_OR_FORWARD"; // const-string v2, "com.wiyun.hsup.DOWNLOAD_OR_FORWARD"
(( android.content.IntentFilter ) v0 ).addAction ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 2057 */
final String v2 = "com.wiyun.hsup.SHOW_MINISITE"; // const-string v2, "com.wiyun.hsup.SHOW_MINISITE"
(( android.content.IntentFilter ) v0 ).addAction ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 2058 */
final String v2 = "WiEngine"; // const-string v2, "WiEngine"
(( android.content.IntentFilter ) v0 ).addCategory ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V
/* .line 2059 */
com.wiyun.engine.nodes.f .m ( );
v3 = com.wiyun.engine.nodes.d.u;
(( android.content.Context ) v2 ).registerReceiver ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 2062 */
/* new-instance v0, Landroid/content/IntentFilter; */
/* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
/* .line 2063 */
final String v2 = "android.intent.action.PACKAGE_ADDED"; // const-string v2, "android.intent.action.PACKAGE_ADDED"
(( android.content.IntentFilter ) v0 ).addAction ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 2064 */
final String v2 = "package"; // const-string v2, "package"
(( android.content.IntentFilter ) v0 ).addDataScheme ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V
/* .line 2065 */
com.wiyun.engine.nodes.f .m ( );
v3 = com.wiyun.engine.nodes.d.v;
(( android.content.Context ) v2 ).registerReceiver ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 2070 */
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 2071 */
final String v2 = "wy_universal_notification"; // const-string v2, "wy_universal_notification"
final String v3 = "layout"; // const-string v3, "layout"
com.wiyun.engine.nodes.f .q ( );
v2 = (( android.content.res.Resources ) v0 ).getIdentifier ( v2, v3, v4 ); // invoke-virtual {v0, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 2072 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 2073 */
int v0 = 1; // const/4 v0, 0x1
com.wiyun.engine.nodes.d.r = (v0!= 0);
/* .line 2094 */
} // :goto_0
/* new-instance v0, Ljava/lang/StringBuilder; */
com.wiyun.engine.nodes.f .q ( );
java.lang.String .valueOf ( v2 );
/* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* const/16 v2, 0x5f */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v2 = "WiEngine"; // const-string v2, "WiEngine"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.wiyun.engine.nodes._U .md5 ( v0 );
/* .line 2098 */
} // :cond_1
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_5 */
/* .line 2145 */
} // :cond_2
} // :goto_1
/* monitor-exit v1 */
return;
/* .line 2075 */
} // :cond_3
try { // :try_start_1
final String v2 = "wy_ad_notification"; // const-string v2, "wy_ad_notification"
final String v3 = "layout"; // const-string v3, "layout"
com.wiyun.engine.nodes.f .q ( );
v0 = (( android.content.res.Resources ) v0 ).getIdentifier ( v2, v3, v4 ); // invoke-virtual {v0, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 2076 */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = com.wiyun.engine.nodes._U .a ( );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 2077 */
int v0 = 1; // const/4 v0, 0x1
com.wiyun.engine.nodes.d.s = (v0!= 0);
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 2032 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
/* .line 2080 */
} // :cond_4
try { // :try_start_2
/* const-class v0, Landroid/R$layout; */
final String v2 = "activity_list_item"; // const-string v2, "activity_list_item"
(( java.lang.Class ) v0 ).getField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2081 */
int v2 = 0; // const/4 v2, 0x0
v0 = (( java.lang.reflect.Field ) v0 ).getInt ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* .line 2083 */
/* const-class v0, Landroid/R$id; */
final String v2 = "icon"; // const-string v2, "icon"
(( java.lang.Class ) v0 ).getField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2084 */
int v2 = 0; // const/4 v2, 0x0
v0 = (( java.lang.reflect.Field ) v0 ).getInt ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* .line 2086 */
/* const-class v0, Landroid/R$id; */
final String v2 = "text1"; // const-string v2, "text1"
(( java.lang.Class ) v0 ).getField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2087 */
int v2 = 0; // const/4 v2, 0x0
v0 = (( java.lang.reflect.Field ) v0 ).getInt ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 2088 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2102 */
} // :cond_5
try { // :try_start_3
/* sget-boolean v0, Lcom/wiyun/engine/nodes/d;->s:Z */
/* if-nez v0, :cond_6 */
/* sget-boolean v0, Lcom/wiyun/engine/nodes/d;->r:Z */
/* if-nez v0, :cond_6 */
if ( v0 != null) { // if-eqz v0, :cond_2
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2106 */
} // :cond_6
com.wiyun.engine.nodes.f .m ( );
final String v2 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"
v0 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_2 */
/* .line 2110 */
v0 = com.wiyun.engine.nodes._U .b ( );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2114 */
com.wiyun.engine.nodes.f .m ( );
final String v2 = "android.permission.INTERNET"; // const-string v2, "android.permission.INTERNET"
v0 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_2 */
/* .line 2118 */
com.wiyun.engine.nodes.f .m ( );
final String v2 = "android.permission.READ_PHONE_STATE"; // const-string v2, "android.permission.READ_PHONE_STATE"
v0 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_2 */
/* .line 2122 */
v0 = com.wiyun.engine.nodes.d.a;
v0 = com.wiyun.engine.nodes.e .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2126 */
com.wiyun.engine.nodes.d .j ( );
/* move-result-wide v2 */
/* .line 2127 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* .line 2128 */
/* sub-long v2, v4, v2 */
com.wiyun.engine.nodes.d .l ( );
/* move-result-wide v4 */
/* cmp-long v0, v2, v4 */
/* if-gez v0, :cond_7 */
/* .line 2129 */
v0 = com.wiyun.engine.nodes.d.a;
com.wiyun.engine.nodes.e .b ( v0 );
/* goto/16 :goto_1 */
/* .line 2134 */
} // :cond_7
com.wiyun.engine.nodes.d .b ( );
/* .line 2137 */
/* new-instance v0, Lcom/wiyun/engine/nodes/d$5; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/d$5;-><init>()V */
/* .line 2143 */
int v2 = 1; // const/4 v2, 0x1
(( java.lang.Thread ) v0 ).setDaemon ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Thread;->setDaemon(Z)V
/* .line 2144 */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* goto/16 :goto_1 */
} // .end method
private static void a ( Long p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 1859 */
v0 = com.wiyun.engine.nodes.d.j;
/* if-nez v0, :cond_0 */
/* .line 1860 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ".wiyun/winotice/"; // const-string v3, ".wiyun/winotice/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.wiyun.engine.nodes.d.f;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1861 */
} // :cond_0
v0 = com.wiyun.engine.nodes.d.j;
java.lang.String .valueOf ( p0,p1 );
com.wiyun.engine.nodes._U .c ( v1 );
com.wiyun.engine.nodes._U .a ( v0,v1 );
/* .line 1862 */
return;
} // .end method
static void a ( android.content.Intent p0 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 2726 */
com.wiyun.engine.nodes.d .d ( p0 );
return;
} // .end method
private static void a ( java.io.File p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 2997 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 2998 */
android.net.Uri .fromFile ( p0 );
final String v2 = "application/vnd.android.package-archive"; // const-string v2, "application/vnd.android.package-archive"
(( android.content.Intent ) v0 ).setDataAndType ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2999 */
/* const/high16 v1, 0x10000000 */
(( android.content.Intent ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 3001 */
try { // :try_start_0
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3006 */
} // :goto_0
return;
/* .line 3002 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3004 */
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
} // .end method
static void a ( java.lang.String p0, android.content.Intent p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 2702 */
com.wiyun.engine.nodes.d .b ( p0,p1 );
return;
} // .end method
static void a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p0, "event" # Ljava/lang/String; */
/* .param p1, "pkg" # Ljava/lang/String; */
/* .prologue */
/* .line 3146 */
/* new-instance v0, Lcom/wiyun/engine/nodes/d$1; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/d$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 3174 */
/* .local v0, "t":Ljava/lang/Thread; */
int v1 = 1; // const/4 v1, 0x1
(( java.lang.Thread ) v0 ).setDaemon ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V
/* .line 3175 */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 3176 */
return;
} // .end method
private static void a ( java.lang.String p0, java.lang.String p1, Integer p2, Integer p3 ) {
/* .locals 10 */
/* .prologue */
/* const/16 v8, 0x8 */
int v9 = 1; // const/4 v9, 0x1
int v0 = 0; // const/4 v0, 0x0
/* .line 2940 */
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 2941 */
com.wiyun.engine.nodes.f .q ( );
/* .line 2943 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2944 */
final String v1 = "Downloading"; // const-string v1, "Downloading"
(( java.lang.StringBuilder ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2945 */
final String v1 = " \""; // const-string v1, " \""
(( java.lang.StringBuilder ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2946 */
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2947 */
final String v1 = "\"..."; // const-string v1, "\"..."
(( java.lang.StringBuilder ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2949 */
/* new-instance v6, Landroid/app/Notification; */
/* invoke-direct {v6}, Landroid/app/Notification;-><init>()V */
/* .line 2950 */
/* iget v1, v6, Landroid/app/Notification;->flags:I */
/* or-int/lit8 v1, v1, 0x2 */
/* iput v1, v6, Landroid/app/Notification;->flags:I */
/* .line 2951 */
/* const v1, 0x1080081 */
/* iput v1, v6, Landroid/app/Notification;->icon:I */
/* .line 2952 */
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.tickerText = v1;
/* .line 2954 */
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "com.wiyun.action.dummy"; // const-string v2, "com.wiyun.action.dummy"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 2955 */
/* const/high16 v2, 0x10000000 */
(( android.content.Intent ) v1 ).addFlags ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 2956 */
com.wiyun.engine.nodes.f .m ( );
android.app.PendingIntent .getBroadcast ( v2,v0,v1,v0 );
this.contentIntent = v1;
/* .line 2959 */
/* sget-boolean v1, Lcom/wiyun/engine/nodes/d;->s:Z */
/* if-nez v1, :cond_0 */
/* sget-boolean v1, Lcom/wiyun/engine/nodes/d;->r:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 2960 */
} // :cond_0
/* new-instance v1, Landroid/widget/RemoteViews; */
/* invoke-direct {v1, v4, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V */
/* .line 2961 */
final String v2 = "panel_event"; // const-string v2, "panel_event"
final String v7 = "id"; // const-string v7, "id"
v2 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v7, v4 ); // invoke-virtual {v3, v2, v7, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v1 ).setViewVisibility ( v2, v8 ); // invoke-virtual {v1, v2, v8}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 2962 */
final String v2 = "panel_image"; // const-string v2, "panel_image"
final String v7 = "id"; // const-string v7, "id"
v2 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v7, v4 ); // invoke-virtual {v3, v2, v7, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v1 ).setViewVisibility ( v2, v8 ); // invoke-virtual {v1, v2, v8}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 2963 */
final String v2 = "down_progress_bar"; // const-string v2, "down_progress_bar"
final String v7 = "id"; // const-string v7, "id"
v2 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v7, v4 ); // invoke-virtual {v3, v2, v7, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v1 ).setProgressBar ( v2, p2, p3, v0 ); // invoke-virtual {v1, v2, p2, p3, v0}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V
/* .line 2964 */
final String v2 = "down_title"; // const-string v2, "down_title"
final String v7 = "id"; // const-string v7, "id"
v2 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v7, v4 ); // invoke-virtual {v3, v2, v7, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.RemoteViews ) v1 ).setTextViewText ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 2965 */
final String v2 = "down_progress_info"; // const-string v2, "down_progress_info"
final String v5 = "id"; // const-string v5, "id"
v2 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v5, v4 ); // invoke-virtual {v3, v2, v5, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 2966 */
final String v5 = "%d/%d (%d%%)"; // const-string v5, "%d/%d (%d%%)"
int v7 = 3; // const/4 v7, 0x3
/* new-array v7, v7, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( p3 );
/* aput-object v8, v7, v0 */
java.lang.Integer .valueOf ( p2 );
/* aput-object v8, v7, v9 */
int v8 = 2; // const/4 v8, 0x2
/* if-nez p2, :cond_1 */
} // :goto_0
java.lang.Integer .valueOf ( v0 );
/* aput-object v0, v7, v8 */
java.lang.String .format ( v5,v7 );
/* .line 2965 */
(( android.widget.RemoteViews ) v1 ).setTextViewText ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 2967 */
v0 = com.wiyun.engine.nodes.d.b;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* .line 2968 */
/* if-nez v0, :cond_2 */
/* .line 2969 */
final String v0 = "image"; // const-string v0, "image"
final String v2 = "id"; // const-string v2, "id"
v0 = (( android.content.res.Resources ) v3 ).getIdentifier ( v0, v2, v4 ); // invoke-virtual {v3, v0, v2, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
final String v2 = "icon"; // const-string v2, "icon"
final String v5 = "drawable"; // const-string v5, "drawable"
v2 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v5, v4 ); // invoke-virtual {v3, v2, v5, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v1 ).setImageViewResource ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
/* move-object v0, v1 */
/* .line 2982 */
} // :goto_1
this.contentView = v0;
/* .line 2983 */
com.wiyun.engine.nodes.f .m ( );
final String v1 = "notification"; // const-string v1, "notification"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/NotificationManager; */
/* .line 2984 */
v1 = (( java.lang.String ) p0 ).hashCode ( ); // invoke-virtual {p0}, Ljava/lang/String;->hashCode()I
(( android.app.NotificationManager ) v0 ).notify ( v1, v6 ); // invoke-virtual {v0, v1, v6}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
/* .line 2985 */
return;
/* .line 2966 */
} // :cond_1
/* mul-int/lit8 v0, p3, 0x64 */
/* div-int/2addr v0, p2 */
/* .line 2971 */
} // :cond_2
final String v2 = "image"; // const-string v2, "image"
final String v5 = "id"; // const-string v5, "id"
v2 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v5, v4 ); // invoke-virtual {v3, v2, v5, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v1 ).setImageViewBitmap ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V
/* move-object v0, v1 */
/* .line 2973 */
} // :cond_3
/* new-instance v2, Landroid/widget/RemoteViews; */
/* invoke-direct {v2, v4, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V */
/* .line 2974 */
final String v7 = "(%d%%)"; // const-string v7, "(%d%%)"
/* new-array v8, v9, [Ljava/lang/Object; */
/* if-nez p2, :cond_4 */
/* move v1, v0 */
} // :goto_2
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v8, v0 */
java.lang.String .format ( v7,v8 );
(( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2975 */
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.RemoteViews ) v2 ).setTextViewText ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 2976 */
v0 = com.wiyun.engine.nodes.d.b;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* .line 2977 */
/* if-nez v0, :cond_5 */
/* .line 2978 */
final String v1 = "icon"; // const-string v1, "icon"
final String v5 = "drawable"; // const-string v5, "drawable"
v1 = (( android.content.res.Resources ) v3 ).getIdentifier ( v1, v5, v4 ); // invoke-virtual {v3, v1, v5, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v2 ).setImageViewResource ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
/* move-object v0, v2 */
/* .line 2974 */
} // :cond_4
/* mul-int/lit8 v1, p3, 0x64 */
/* div-int/2addr v1, p2 */
/* .line 2980 */
} // :cond_5
(( android.widget.RemoteViews ) v2 ).setImageViewBitmap ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V
/* move-object v0, v2 */
} // .end method
private static void a ( java.lang.StringBuilder p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 2213 */
final String v0 = "device_id"; // const-string v0, "device_id"
com.wiyun.engine.nodes.f .h ( );
com.wiyun.engine.nodes.d .a ( p0,v0,v1 );
/* .line 2216 */
final String v0 = "app_key"; // const-string v0, "app_key"
com.wiyun.engine.nodes.f .g ( );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2219 */
final String v0 = "sdk_name"; // const-string v0, "sdk_name"
final String v1 = "WiEngine"; // const-string v1, "WiEngine"
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2222 */
final String v0 = "os"; // const-string v0, "os"
final String v1 = "Android"; // const-string v1, "Android"
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2225 */
final String v0 = "os_version"; // const-string v0, "os_version"
v1 = com.wiyun.engine.nodes.f .j ( );
java.lang.String .valueOf ( v1 );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2228 */
final String v0 = "lat"; // const-string v0, "lat"
com.wiyun.engine.nodes.f .o ( );
/* move-result-wide v1 */
java.lang.String .valueOf ( v1,v2 );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2231 */
final String v0 = "lon"; // const-string v0, "lon"
com.wiyun.engine.nodes.f .p ( );
/* move-result-wide v1 */
java.lang.String .valueOf ( v1,v2 );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2234 */
final String v0 = "brand"; // const-string v0, "brand"
com.wiyun.engine.nodes.f .d ( );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2237 */
final String v0 = "model"; // const-string v0, "model"
com.wiyun.engine.nodes.f .e ( );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2240 */
final String v0 = "lan"; // const-string v0, "lan"
com.wiyun.engine.nodes.f .k ( );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2243 */
final String v0 = "country"; // const-string v0, "country"
com.wiyun.engine.nodes.f .l ( );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2246 */
final String v0 = "network"; // const-string v0, "network"
v1 = com.wiyun.engine.nodes.f .f ( );
java.lang.String .valueOf ( v1 );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2249 */
final String v0 = "pkg"; // const-string v0, "pkg"
com.wiyun.engine.nodes.f .q ( );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2252 */
final String v0 = "screen_width"; // const-string v0, "screen_width"
v1 = com.wiyun.engine.nodes.f .a ( );
java.lang.String .valueOf ( v1 );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2255 */
final String v0 = "screen_height"; // const-string v0, "screen_height"
v1 = com.wiyun.engine.nodes.f .b ( );
java.lang.String .valueOf ( v1 );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2258 */
final String v0 = "screen_dpi"; // const-string v0, "screen_dpi"
v1 = com.wiyun.engine.nodes.f .c ( );
java.lang.String .valueOf ( v1 );
com.wiyun.engine.nodes.d .b ( p0,v0,v1 );
/* .line 2259 */
return;
} // .end method
private static void a ( java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 3040 */
if ( p2 != null) { // if-eqz p2, :cond_1
v0 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_1 */
/* .line 3041 */
v0 = (( java.lang.StringBuilder ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I
/* if-lez v0, :cond_0 */
/* .line 3042 */
/* const/16 v0, 0x3f */
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 3043 */
} // :cond_0
(( java.lang.StringBuilder ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
java.net.URLEncoder .encode ( p2,v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3045 */
} // :cond_1
return;
} // .end method
static Boolean a ( com.wiyun.engine.nodes.d$b p0 ) { //synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Ljava/lang/SecurityException;, */
/* Ljava/lang/NoSuchFieldException;, */
/* Ljava/lang/IllegalArgumentException;, */
/* Ljava/lang/IllegalAccessException;, */
/* Lorg/apache/http/client/ClientProtocolException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 2437 */
v0 = com.wiyun.engine.nodes.d .b ( p0 );
} // .end method
static Boolean a ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "pkg" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 2988 */
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v3 ).getPackageManager ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 2990 */
/* .local v1, "pm":Landroid/content/pm/PackageManager; */
try { // :try_start_0
(( android.content.pm.PackageManager ) v1 ).getPackageGids ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/pm/PackageManager;->getPackageGids(Ljava/lang/String;)[I
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v3 != null) { // if-eqz v3, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* .line 2992 */
} // :cond_0
} // :goto_0
/* .line 2991 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2992 */
/* .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
} // .end method
static void b ( ) {
/* .locals 9 */
/* .prologue */
/* .line 2148 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* .line 2149 */
/* .local v1, "now":J */
v4 = v5 = com.wiyun.engine.nodes.d.d;
/* .line 2150 */
/* .local v4, "size":I */
/* add-int/lit8 v0, v4, -0x1 */
/* .local v0, "i":I */
} // :goto_0
/* if-gez v0, :cond_0 */
/* .line 2155 */
return;
/* .line 2151 */
} // :cond_0
v5 = com.wiyun.engine.nodes.d.d;
/* check-cast v3, Lcom/wiyun/engine/nodes/d$a; */
/* .line 2152 */
/* .local v3, "pip":Lcom/wiyun/engine/nodes/d$a; */
/* iget-wide v5, v3, Lcom/wiyun/engine/nodes/d$a;->c:J */
/* sub-long v5, v1, v5 */
/* const-wide/32 v7, 0x927c0 */
/* cmp-long v5, v5, v7 */
/* if-lez v5, :cond_1 */
/* .line 2153 */
v5 = com.wiyun.engine.nodes.d.d;
/* .line 2150 */
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
private static void b ( Long p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 1878 */
v0 = com.wiyun.engine.nodes.d.k;
/* if-nez v0, :cond_0 */
/* .line 1879 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ".wiyun/winotice/"; // const-string v3, ".wiyun/winotice/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.wiyun.engine.nodes.d.g;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1880 */
} // :cond_0
v0 = com.wiyun.engine.nodes.d.k;
java.lang.String .valueOf ( p0,p1 );
com.wiyun.engine.nodes._U .c ( v1 );
com.wiyun.engine.nodes._U .a ( v0,v1 );
/* .line 1881 */
return;
} // .end method
static void b ( android.content.Intent p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1926 */
com.wiyun.engine.nodes.d .c ( p0 );
return;
} // .end method
static void b ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 3009 */
com.wiyun.engine.nodes.f .m ( );
final String v1 = "notification"; // const-string v1, "notification"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/NotificationManager; */
/* .line 3010 */
v1 = (( java.lang.String ) p0 ).hashCode ( ); // invoke-virtual {p0}, Ljava/lang/String;->hashCode()I
(( android.app.NotificationManager ) v0 ).cancel ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
/* .line 3011 */
v0 = com.wiyun.engine.nodes.d.c;
/* .line 3012 */
return;
} // .end method
private static void b ( java.lang.String p0, android.content.Intent p1 ) {
/* .locals 4 */
/* .param p0, "pkg" # Ljava/lang/String; */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 2703 */
final String v2 = "notice_id"; // const-string v2, "notice_id"
(( android.content.Intent ) p1 ).getStringExtra ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2704 */
/* .local v1, "nid":Ljava/lang/String; */
v2 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v2, :cond_0 */
v2 = android.text.TextUtils .isEmpty ( p0 );
/* if-nez v2, :cond_0 */
v2 = com.wiyun.engine.nodes.b .b ( p0 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 2706 */
com.wiyun.engine.nodes.d .b ( v1 );
/* .line 2707 */
v2 = com.wiyun.engine.nodes.d.b;
/* .line 2710 */
final String v2 = "installed"; // const-string v2, "installed"
final String v3 = ""; // const-string v3, ""
com.wiyun.engine.nodes.d .a ( v2,v3 );
/* .line 2714 */
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
/* .line 2715 */
/* .local v0, "action":Ljava/lang/String; */
final String v2 = "com.wiyun.hsup.DOWNLOAD_OR_FORWARD"; // const-string v2, "com.wiyun.hsup.DOWNLOAD_OR_FORWARD"
v2 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 2716 */
com.wiyun.engine.nodes.d .f ( p1 );
/* .line 2724 */
} // .end local v0 # "action":Ljava/lang/String;
} // :cond_0
} // :goto_0
return;
/* .line 2718 */
/* .restart local v0 # "action":Ljava/lang/String; */
} // :cond_1
v2 = com.wiyun.engine.nodes.d .c ( p0 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 2719 */
v2 = com.wiyun.engine.nodes.b .d ( p0 );
/* if-nez v2, :cond_0 */
/* .line 2720 */
final String v2 = "launched"; // const-string v2, "launched"
com.wiyun.engine.nodes.d .a ( v2,p0 );
} // .end method
private static void b ( java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 3051 */
if ( p2 != null) { // if-eqz p2, :cond_1
v0 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_1 */
/* .line 3052 */
v0 = (( java.lang.StringBuilder ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I
/* if-lez v0, :cond_0 */
/* .line 3053 */
/* const/16 v0, 0x26 */
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 3054 */
} // :cond_0
(( java.lang.StringBuilder ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
java.net.URLEncoder .encode ( p2,v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3056 */
} // :cond_1
return;
} // .end method
private static Boolean b ( com.wiyun.engine.nodes.d$b p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Ljava/lang/SecurityException;, */
/* Ljava/lang/NoSuchFieldException;, */
/* Ljava/lang/IllegalArgumentException;, */
/* Ljava/lang/IllegalAccessException;, */
/* Lorg/apache/http/client/ClientProtocolException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
int v8 = 0; // const/4 v8, 0x0
/* const/16 v9, 0x8 */
int v3 = 0; // const/4 v3, 0x0
/* .line 2440 */
/* if-nez p0, :cond_1 */
/* .line 2699 */
} // :cond_0
} // :goto_0
/* .line 2444 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/wiyun/engine/nodes/d$b;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* sget-boolean v0, Lcom/wiyun/engine/nodes/d;->s:Z */
/* if-nez v0, :cond_2 */
/* sget-boolean v0, Lcom/wiyun/engine/nodes/d;->r:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2452 */
} // :cond_2
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 2453 */
com.wiyun.engine.nodes.f .q ( );
/* .line 2456 */
v0 = this.k;
final String v1 = "ACTION_"; // const-string v1, "ACTION_"
v1 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* .line 2457 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 2458 */
/* const-class v0, Landroid/content/Intent; */
v2 = this.k;
(( java.lang.Class ) v0 ).getField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2459 */
(( java.lang.reflect.Field ) v0 ).get ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
this.k = v0;
/* .line 2463 */
} // :cond_3
/* if-nez v1, :cond_4 */
/* .line 2464 */
final String v0 = "com.wiyun.hsup.DOWNLOAD_APP"; // const-string v0, "com.wiyun.hsup.DOWNLOAD_APP"
v2 = this.k;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 2465 */
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2468 */
v0 = this.o;
final String v2 = "app_pkg"; // const-string v2, "app_pkg"
(( org.json.JSONObject ) v0 ).optString ( v2 ); // invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2469 */
v2 = this.o;
final String v7 = "app_url"; // const-string v7, "app_url"
(( org.json.JSONObject ) v2 ).optString ( v7 ); // invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2470 */
v7 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v7, :cond_0 */
v2 = android.text.TextUtils .isEmpty ( v2 );
/* if-nez v2, :cond_0 */
/* .line 2475 */
v2 = com.wiyun.engine.nodes.d .a ( v0 );
if ( v2 != null) { // if-eqz v2, :cond_4
v0 = com.wiyun.engine.nodes.b .b ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2510 */
} // :cond_4
v0 = this.l;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_5 */
/* .line 2511 */
v0 = this.l;
final String v2 = "CATEGORY_"; // const-string v2, "CATEGORY_"
v0 = (( java.lang.String ) v0 ).startsWith ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 2512 */
/* const-class v0, Landroid/content/Intent; */
v2 = this.l;
(( java.lang.Class ) v0 ).getField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2513 */
(( java.lang.reflect.Field ) v0 ).get ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
this.l = v0;
/* .line 2518 */
} // :cond_5
/* iget-boolean v0, p0, Lcom/wiyun/engine/nodes/d$b;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2528 */
} // :cond_6
if ( v1 != null) { // if-eqz v1, :cond_e
/* .line 2529 */
/* new-instance v1, Landroid/content/Intent; */
final String v0 = "com.wiyun.hsup.FORWARD_INTENT"; // const-string v0, "com.wiyun.hsup.FORWARD_INTENT"
/* invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 2530 */
final String v0 = "intent_action"; // const-string v0, "intent_action"
v2 = this.k;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2531 */
final String v0 = "intent_category"; // const-string v0, "intent_category"
v2 = this.l;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2532 */
final String v0 = "intent_package"; // const-string v0, "intent_package"
v2 = this.m;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2533 */
final String v0 = "intent_class"; // const-string v0, "intent_class"
v2 = this.n;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2534 */
final String v2 = "intent_extra"; // const-string v2, "intent_extra"
v0 = this.o;
/* if-nez v0, :cond_d */
final String v0 = ""; // const-string v0, ""
} // :goto_1
(( android.content.Intent ) v1 ).putExtra ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2535 */
final String v0 = "data_uri"; // const-string v0, "data_uri"
v2 = this.p;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2536 */
final String v0 = "data_type"; // const-string v0, "data_type"
v2 = this.q;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* move-object v2, v1 */
/* .line 2626 */
} // :goto_2
final String v0 = "notice_id"; // const-string v0, "notice_id"
v1 = this.a;
(( android.content.Intent ) v2 ).putExtra ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2627 */
final String v0 = "WiEngine"; // const-string v0, "WiEngine"
(( android.content.Intent ) v2 ).addCategory ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2628 */
/* const/high16 v0, 0x40000000 # 2.0f */
(( android.content.Intent ) v2 ).addFlags ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 2629 */
(( android.content.Intent ) v2 ).setPackage ( v6 ); // invoke-virtual {v2, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2632 */
/* new-instance v0, Ljava/util/ArrayList; */
v1 = com.wiyun.engine.nodes.d.c;
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 2633 */
} // :cond_7
v0 = } // :goto_3
/* if-nez v0, :cond_23 */
/* .line 2639 */
/* new-instance v1, Landroid/app/Notification; */
/* invoke-direct {v1}, Landroid/app/Notification;-><init>()V */
/* .line 2642 */
try { // :try_start_0
/* const-class v0, Landroid/R$drawable; */
v7 = this.b;
(( java.lang.Class ) v0 ).getField ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2643 */
int v7 = 0; // const/4 v7, 0x0
(( java.lang.reflect.Field ) v0 ).getInt ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2646 */
/* if-nez v0, :cond_8 */
/* .line 2647 */
final String v0 = "icon"; // const-string v0, "icon"
final String v7 = "drawable"; // const-string v7, "drawable"
v0 = (( android.content.res.Resources ) v5 ).getIdentifier ( v0, v7, v6 ); // invoke-virtual {v5, v0, v7, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 2649 */
} // :cond_8
} // :goto_4
/* iput v0, v1, Landroid/app/Notification;->icon:I */
/* .line 2650 */
v0 = this.d;
this.tickerText = v0;
/* .line 2651 */
com.wiyun.engine.nodes.f .m ( );
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
/* long-to-int v7, v7 */
android.app.PendingIntent .getBroadcast ( v0,v7,v2,v3 );
this.contentIntent = v0;
/* .line 2655 */
/* sget-boolean v0, Lcom/wiyun/engine/nodes/d;->s:Z */
/* if-nez v0, :cond_9 */
/* sget-boolean v0, Lcom/wiyun/engine/nodes/d;->r:Z */
if ( v0 != null) { // if-eqz v0, :cond_27
/* .line 2656 */
} // :cond_9
/* new-instance v0, Landroid/widget/RemoteViews; */
/* invoke-direct {v0, v6, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V */
/* .line 2657 */
/* iget-boolean v2, p0, Lcom/wiyun/engine/nodes/d$b;->h:Z */
if ( v2 != null) { // if-eqz v2, :cond_24
/* .line 2658 */
final String v2 = "panel_download"; // const-string v2, "panel_download"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v0 ).setViewVisibility ( v2, v9 ); // invoke-virtual {v0, v2, v9}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 2659 */
final String v2 = "panel_event"; // const-string v2, "panel_event"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v0 ).setViewVisibility ( v2, v9 ); // invoke-virtual {v0, v2, v9}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 2660 */
final String v2 = "image"; // const-string v2, "image"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v0 ).setViewVisibility ( v2, v9 ); // invoke-virtual {v0, v2, v9}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 2661 */
final String v2 = "banner"; // const-string v2, "banner"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
v3 = this.j;
(( android.widget.RemoteViews ) v0 ).setImageViewBitmap ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V
/* .line 2685 */
} // :goto_5
this.contentView = v0;
/* .line 2686 */
com.wiyun.engine.nodes.f .m ( );
final String v2 = "notification"; // const-string v2, "notification"
(( android.content.Context ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/NotificationManager; */
/* .line 2687 */
v2 = this.a;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
(( android.app.NotificationManager ) v0 ).notify ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
/* .line 2690 */
v0 = com.wiyun.engine.nodes.d.c;
v1 = this.a;
/* iget-boolean v2, p0, Lcom/wiyun/engine/nodes/d$b;->i:Z */
java.lang.Boolean .valueOf ( v2 );
/* .line 2697 */
final String v0 = "shown"; // const-string v0, "shown"
final String v1 = ""; // const-string v1, ""
com.wiyun.engine.nodes.d .a ( v0,v1 );
/* move v3, v4 */
/* .line 2699 */
/* goto/16 :goto_0 */
/* .line 2482 */
} // :cond_a
final String v0 = "com.wiyun.hsup.INSTALL_SHORTCUT"; // const-string v0, "com.wiyun.hsup.INSTALL_SHORTCUT"
v2 = this.k;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 2483 */
com.wiyun.engine.nodes.f .m ( );
final String v2 = "com.android.launcher.permission.INSTALL_SHORTCUT"; // const-string v2, "com.android.launcher.permission.INSTALL_SHORTCUT"
v0 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
if ( v0 != null) { // if-eqz v0, :cond_4
/* goto/16 :goto_0 */
/* .line 2490 */
} // :cond_b
final String v0 = "com.wiyun.hsup.DOWNLOAD_OR_FORWARD"; // const-string v0, "com.wiyun.hsup.DOWNLOAD_OR_FORWARD"
v2 = this.k;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 2491 */
v0 = this.o;
/* if-nez v0, :cond_4 */
/* goto/16 :goto_0 */
/* .line 2498 */
} // :cond_c
final String v0 = "com.wiyun.hsup.SHOW_MINISITE"; // const-string v0, "com.wiyun.hsup.SHOW_MINISITE"
v2 = this.k;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 2499 */
com.wiyun.engine.nodes.f .n ( );
/* if-nez v0, :cond_4 */
/* goto/16 :goto_0 */
/* .line 2534 */
} // :cond_d
v0 = this.o;
(( org.json.JSONObject ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
/* goto/16 :goto_1 */
/* .line 2537 */
} // :cond_e
final String v0 = "com.wiyun.hsup.INSTALL_SHORTCUT"; // const-string v0, "com.wiyun.hsup.INSTALL_SHORTCUT"
v1 = this.k;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_19
/* .line 2538 */
/* new-instance v1, Landroid/content/Intent; */
final String v0 = "com.android.launcher.action.INSTALL_SHORTCUT"; // const-string v0, "com.android.launcher.action.INSTALL_SHORTCUT"
/* invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 2539 */
final String v0 = "android.intent.extra.shortcut.NAME"; // const-string v0, "android.intent.extra.shortcut.NAME"
v2 = this.d;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2540 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_f
/* .line 2541 */
final String v0 = "android.intent.extra.shortcut.ICON"; // const-string v0, "android.intent.extra.shortcut.ICON"
v2 = this.j;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* .line 2542 */
} // :cond_f
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_17
/* .line 2544 */
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
/* .line 2547 */
v0 = this.o;
final String v3 = "shortcut_action"; // const-string v3, "shortcut_action"
(( org.json.JSONObject ) v0 ).optString ( v3 ); // invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2548 */
v3 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v3, :cond_11 */
/* .line 2549 */
final String v3 = "ACTION_"; // const-string v3, "ACTION_"
v3 = (( java.lang.String ) v0 ).startsWith ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_10
/* .line 2550 */
/* const-class v3, Landroid/content/Intent; */
(( java.lang.Class ) v3 ).getField ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2551 */
(( java.lang.reflect.Field ) v0 ).get ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 2553 */
} // :cond_10
(( android.content.Intent ) v2 ).setAction ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2557 */
} // :cond_11
v0 = this.o;
final String v3 = "shortcut_category"; // const-string v3, "shortcut_category"
(( org.json.JSONObject ) v0 ).optString ( v3 ); // invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2558 */
v3 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v3, :cond_13 */
/* .line 2559 */
final String v3 = "CATEGORY_"; // const-string v3, "CATEGORY_"
v3 = (( java.lang.String ) v0 ).startsWith ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_12
/* .line 2560 */
/* const-class v3, Landroid/content/Intent; */
(( java.lang.Class ) v3 ).getField ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2561 */
(( java.lang.reflect.Field ) v0 ).get ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 2563 */
} // :cond_12
(( android.content.Intent ) v2 ).addCategory ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2567 */
} // :cond_13
v0 = this.o;
final String v3 = "shortcut_package"; // const-string v3, "shortcut_package"
(( org.json.JSONObject ) v0 ).optString ( v3 ); // invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2568 */
v3 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v3, :cond_14 */
/* .line 2569 */
v3 = this.o;
final String v5 = "shortcut_class"; // const-string v5, "shortcut_class"
(( org.json.JSONObject ) v3 ).optString ( v5 ); // invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2570 */
v5 = android.text.TextUtils .isEmpty ( v3 );
/* if-nez v5, :cond_18 */
/* .line 2571 */
(( android.content.Intent ) v2 ).setClassName ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2578 */
} // :cond_14
} // :goto_6
v0 = this.o;
final String v3 = "shortcut_uri"; // const-string v3, "shortcut_uri"
(( org.json.JSONObject ) v0 ).optString ( v3 ); // invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2579 */
v3 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v3, :cond_15 */
/* .line 2580 */
android.net.Uri .parse ( v0 );
(( android.content.Intent ) v2 ).setData ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 2584 */
} // :cond_15
v0 = this.o;
final String v3 = "shortcut_type"; // const-string v3, "shortcut_type"
(( org.json.JSONObject ) v0 ).optString ( v3 ); // invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2585 */
v3 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v3, :cond_16 */
/* .line 2586 */
(( android.content.Intent ) v2 ).setType ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2590 */
} // :cond_16
final String v0 = "android.intent.extra.shortcut.INTENT"; // const-string v0, "android.intent.extra.shortcut.INTENT"
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* .line 2592 */
} // :cond_17
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v0 ).sendBroadcast ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
/* .line 2599 */
final String v0 = "installed"; // const-string v0, "installed"
final String v1 = ""; // const-string v1, ""
com.wiyun.engine.nodes.d .a ( v0,v1 );
/* move v3, v4 */
/* .line 2600 */
/* goto/16 :goto_0 */
/* .line 2573 */
} // :cond_18
(( android.content.Intent ) v2 ).setPackage ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2602 */
} // :cond_19
/* new-instance v1, Landroid/content/Intent; */
v0 = this.k;
/* invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 2603 */
v0 = this.l;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_1a */
/* .line 2604 */
v0 = this.l;
(( android.content.Intent ) v1 ).addCategory ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2605 */
} // :cond_1a
v0 = this.m;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1b
v0 = this.n;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_21 */
/* .line 2606 */
} // :cond_1b
v0 = this.m;
v2 = this.n;
(( android.content.Intent ) v1 ).setClassName ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2610 */
} // :cond_1c
} // :goto_7
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_1e
/* .line 2611 */
v0 = this.o;
(( org.json.JSONObject ) v0 ).keys ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
/* .line 2612 */
} // :cond_1d
v0 = } // :goto_8
/* if-nez v0, :cond_22 */
/* .line 2619 */
} // :cond_1e
v0 = this.p;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_1f */
/* .line 2620 */
v0 = this.p;
android.net.Uri .parse ( v0 );
(( android.content.Intent ) v1 ).setData ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 2621 */
} // :cond_1f
v0 = this.q;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_20 */
/* .line 2622 */
v0 = this.q;
(( android.content.Intent ) v1 ).setType ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
} // :cond_20
/* move-object v2, v1 */
/* goto/16 :goto_2 */
/* .line 2607 */
} // :cond_21
v0 = this.m;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_1c */
/* .line 2608 */
v0 = this.m;
(( android.content.Intent ) v1 ).setPackage ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2613 */
} // :cond_22
/* check-cast v0, Ljava/lang/String; */
/* .line 2614 */
v7 = this.o;
(( org.json.JSONObject ) v7 ).optString ( v0 ); // invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2615 */
v8 = android.text.TextUtils .isEmpty ( v7 );
/* if-nez v8, :cond_1d */
/* .line 2616 */
(( android.content.Intent ) v1 ).putExtra ( v0, v7 ); // invoke-virtual {v1, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2633 */
} // :cond_23
/* check-cast v0, Ljava/lang/String; */
/* .line 2634 */
v1 = com.wiyun.engine.nodes.d.c;
/* check-cast v1, Ljava/lang/Boolean; */
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 2635 */
com.wiyun.engine.nodes.d .b ( v0 );
/* goto/16 :goto_3 */
/* .line 2644 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2647 */
final String v0 = "icon"; // const-string v0, "icon"
final String v7 = "drawable"; // const-string v7, "drawable"
v0 = (( android.content.res.Resources ) v5 ).getIdentifier ( v0, v7, v6 ); // invoke-virtual {v5, v0, v7, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* goto/16 :goto_4 */
/* .line 2645 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 2647 */
final String v1 = "icon"; // const-string v1, "icon"
final String v2 = "drawable"; // const-string v2, "drawable"
(( android.content.res.Resources ) v5 ).getIdentifier ( v1, v2, v6 ); // invoke-virtual {v5, v1, v2, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 2648 */
/* throw v0 */
/* .line 2663 */
} // :cond_24
final String v2 = "panel_download"; // const-string v2, "panel_download"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v0 ).setViewVisibility ( v2, v9 ); // invoke-virtual {v0, v2, v9}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 2664 */
final String v2 = "panel_image"; // const-string v2, "panel_image"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v0 ).setViewVisibility ( v2, v9 ); // invoke-virtual {v0, v2, v9}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 2665 */
final String v2 = "event_title"; // const-string v2, "event_title"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
v3 = this.d;
(( android.widget.RemoteViews ) v0 ).setTextViewText ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 2666 */
v2 = this.e;
v2 = android.text.TextUtils .isEmpty ( v2 );
/* if-nez v2, :cond_25 */
/* .line 2667 */
final String v2 = "event_info"; // const-string v2, "event_info"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
v3 = this.e;
(( android.widget.RemoteViews ) v0 ).setTextViewText ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 2668 */
} // :cond_25
v2 = this.j;
if ( v2 != null) { // if-eqz v2, :cond_26
/* .line 2669 */
final String v2 = "image"; // const-string v2, "image"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
v3 = this.j;
(( android.widget.RemoteViews ) v0 ).setImageViewBitmap ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V
/* goto/16 :goto_5 */
/* .line 2671 */
} // :cond_26
final String v2 = "image"; // const-string v2, "image"
final String v3 = "id"; // const-string v3, "id"
v2 = (( android.content.res.Resources ) v5 ).getIdentifier ( v2, v3, v6 ); // invoke-virtual {v5, v2, v3, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
final String v3 = "icon"; // const-string v3, "icon"
final String v7 = "drawable"; // const-string v7, "drawable"
v3 = (( android.content.res.Resources ) v5 ).getIdentifier ( v3, v7, v6 ); // invoke-virtual {v5, v3, v7, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v0 ).setImageViewResource ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
/* goto/16 :goto_5 */
/* .line 2674 */
} // :cond_27
/* new-instance v0, Landroid/widget/RemoteViews; */
/* invoke-direct {v0, v6, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V */
/* .line 2675 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2676 */
v3 = this.d;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2677 */
v3 = this.e;
v3 = android.text.TextUtils .isEmpty ( v3 );
/* if-nez v3, :cond_28 */
/* .line 2678 */
/* const/16 v3, 0xa */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v7 = this.e;
(( java.lang.StringBuilder ) v3 ).append ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2679 */
} // :cond_28
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.RemoteViews ) v0 ).setTextViewText ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 2680 */
v2 = this.j;
if ( v2 != null) { // if-eqz v2, :cond_29
/* .line 2681 */
v3 = this.j;
(( android.widget.RemoteViews ) v0 ).setImageViewBitmap ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V
/* goto/16 :goto_5 */
/* .line 2683 */
} // :cond_29
final String v3 = "icon"; // const-string v3, "icon"
final String v7 = "drawable"; // const-string v7, "drawable"
v3 = (( android.content.res.Resources ) v5 ).getIdentifier ( v3, v7, v6 ); // invoke-virtual {v5, v3, v7, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
(( android.widget.RemoteViews ) v0 ).setImageViewResource ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
/* goto/16 :goto_5 */
} // .end method
static b ( org.apache.http.HttpEntity p0 ) {
/* .locals 6 */
/* .param p0, "entity" # Lorg/apache/http/HttpEntity; */
/* .prologue */
/* .line 3079 */
try { // :try_start_0
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 3080 */
/* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
/* const/16 v5, 0x800 */
/* new-array v1, v5, [B */
/* .line 3081 */
/* .local v1, "buf":[B */
/* .line 3082 */
/* .local v4, "is":Ljava/io/InputStream; */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
int v5 = -1; // const/4 v5, -0x1
/* if-ne v3, v5, :cond_0 */
/* .line 3084 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 3086 */
} // .end local v0 # "baos":Ljava/io/ByteArrayOutputStream;
} // .end local v1 # "buf":[B
} // .end local v3 # "i":I
} // .end local v4 # "is":Ljava/io/InputStream;
} // :goto_1
/* .line 3083 */
/* .restart local v0 # "baos":Ljava/io/ByteArrayOutputStream; */
/* .restart local v1 # "buf":[B */
/* .restart local v3 # "i":I */
/* .restart local v4 # "is":Ljava/io/InputStream; */
} // :cond_0
int v5 = 0; // const/4 v5, 0x0
(( java.io.ByteArrayOutputStream ) v0 ).write ( v1, v5, v3 ); // invoke-virtual {v0, v1, v5, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 3082 */
(( java.io.InputStream ) v4 ).read ( v1 ); // invoke-virtual {v4, v1}, Ljava/io/InputStream;->read([B)I
/* :try_end_0 */
v3 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3085 */
} // .end local v0 # "baos":Ljava/io/ByteArrayOutputStream;
} // .end local v1 # "buf":[B
} // .end local v3 # "i":I
} // .end local v4 # "is":Ljava/io/InputStream;
/* :catch_0 */
/* move-exception v2 */
/* .line 3086 */
/* .local v2, "e":Ljava/lang/Exception; */
int v5 = 0; // const/4 v5, 0x0
} // .end method
static org.apache.http.impl.client.DefaultHttpClient c ( ) {
/* .locals 8 */
/* .prologue */
/* const v2, 0x15f90 */
/* const/16 v1, 0x7530 */
/* .line 3107 */
v3 = com.wiyun.engine.nodes.f .s ( );
/* .line 3110 */
/* new-instance v4, Lorg/apache/http/conn/scheme/SchemeRegistry; */
/* invoke-direct {v4}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V */
/* .line 3111 */
/* new-instance v0, Lorg/apache/http/conn/scheme/Scheme; */
final String v5 = "http"; // const-string v5, "http"
org.apache.http.conn.scheme.PlainSocketFactory .getSocketFactory ( );
/* const/16 v7, 0x50 */
/* invoke-direct {v0, v5, v6, v7}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
(( org.apache.http.conn.scheme.SchemeRegistry ) v4 ).register ( v0 ); // invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
/* .line 3112 */
/* new-instance v5, Lorg/apache/http/params/BasicHttpParams; */
/* invoke-direct {v5}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
/* .line 3113 */
v0 = org.apache.http.HttpVersion.HTTP_1_1;
org.apache.http.params.HttpProtocolParams .setVersion ( v5,v0 );
/* .line 3114 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
org.apache.http.params.HttpProtocolParams .setContentCharset ( v5,v0 );
/* .line 3115 */
int v0 = 0; // const/4 v0, 0x0
org.apache.http.params.HttpProtocolParams .setUseExpectContinue ( v5,v0 );
/* .line 3116 */
final String v0 = "compatibility"; // const-string v0, "compatibility"
org.apache.http.client.params.HttpClientParams .setCookiePolicy ( v5,v0 );
/* .line 3117 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* move v0, v1 */
} // :goto_0
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v5,v0 );
/* .line 3118 */
if ( v3 != null) { // if-eqz v3, :cond_2
} // :goto_1
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v5,v1 );
/* .line 3119 */
/* new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager; */
/* invoke-direct {v0, v5, v4}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V */
/* .line 3120 */
/* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v1, v0, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V */
/* .line 3122 */
/* if-nez v3, :cond_0 */
v0 = com.wiyun.engine.nodes.d .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3123 */
com.wiyun.engine.nodes.d .e ( );
/* .line 3124 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3125 */
(( org.apache.http.impl.client.DefaultHttpClient ) v1 ).getParams ( ); // invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
final String v3 = "http.route.default-proxy"; // const-string v3, "http.route.default-proxy"
/* .line 3128 */
} // :cond_0
} // :cond_1
/* move v0, v2 */
/* .line 3117 */
} // :cond_2
/* move v1, v2 */
/* .line 3118 */
} // .end method
private static void c ( Long p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 1897 */
v0 = com.wiyun.engine.nodes.d.l;
/* if-nez v0, :cond_0 */
/* .line 1898 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ".wiyun/winotice/"; // const-string v3, ".wiyun/winotice/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.wiyun.engine.nodes.d.h;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1899 */
} // :cond_0
v0 = com.wiyun.engine.nodes.d.l;
java.lang.String .valueOf ( p0,p1 );
com.wiyun.engine.nodes._U .c ( v1 );
com.wiyun.engine.nodes._U .a ( v0,v1 );
/* .line 1900 */
return;
} // .end method
private static void c ( android.content.Intent p0 ) {
/* .locals 8 */
/* .prologue */
/* .line 1927 */
com.wiyun.engine.nodes.f .n ( );
/* .line 1928 */
/* if-nez v1, :cond_1 */
/* .line 1946 */
} // :cond_0
} // :goto_0
return;
/* .line 1931 */
} // :cond_1
final String v0 = "window"; // const-string v0, "window"
(( android.app.Activity ) v1 ).getSystemService ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* move-object v6, v0 */
/* check-cast v6, Landroid/view/WindowManager; */
/* .line 1932 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 1937 */
try { // :try_start_0
com.wiyun.engine.nodes.d .a ( v6,v1,p0 );
/* .line 1938 */
/* new-instance v0, Landroid/view/WindowManager$LayoutParams; */
/* .line 1939 */
int v1 = -1; // const/4 v1, -0x1
int v2 = -1; // const/4 v2, -0x1
/* .line 1940 */
int v3 = 2; // const/4 v3, 0x2
/* .line 1941 */
int v4 = 0; // const/4 v4, 0x0
/* .line 1942 */
int v5 = -3; // const/4 v5, -0x3
/* .line 1938 */
/* invoke-direct/range {v0 ..v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V */
/* .line 1943 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1944 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
static Boolean c ( java.lang.String p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/ActivityNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 3015 */
/* new-instance v0, Landroid/content/Intent; */
final String v2 = "android.intent.action.MAIN"; // const-string v2, "android.intent.action.MAIN"
/* invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 3016 */
final String v2 = "android.intent.category.LAUNCHER"; // const-string v2, "android.intent.category.LAUNCHER"
(( android.content.Intent ) v0 ).addCategory ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
/* .line 3017 */
(( android.content.Intent ) v0 ).setPackage ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 3018 */
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v2 ).getPackageManager ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 3019 */
(( android.content.pm.PackageManager ) v2 ).queryIntentActivities ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
v2 = /* .line 3020 */
/* if-nez v2, :cond_0 */
/* .line 3022 */
int v2 = 0; // const/4 v2, 0x0
try { // :try_start_0
/* check-cast v0, Landroid/content/pm/ResolveInfo; */
/* .line 3023 */
/* new-instance v2, Landroid/content/Intent; */
final String v3 = "android.intent.action.MAIN"; // const-string v3, "android.intent.action.MAIN"
/* invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 3024 */
final String v3 = "android.intent.category.LAUNCHER"; // const-string v3, "android.intent.category.LAUNCHER"
(( android.content.Intent ) v2 ).addCategory ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
/* .line 3025 */
v0 = this.activityInfo;
v0 = this.name;
(( android.content.Intent ) v2 ).setClassName ( p0, v0 ); // invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 3026 */
/* const/high16 v0, 0x10000000 */
(( android.content.Intent ) v2 ).addFlags ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 3027 */
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v0 ).startActivity ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3028 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3033 */
} // :goto_0
/* .line 3029 */
/* :catch_0 */
/* move-exception v0 */
} // :cond_0
/* move v0, v1 */
/* .line 3033 */
} // .end method
private static void d ( android.content.Intent p0 ) {
/* .locals 4 */
/* .param p0, "intent" # Landroid/content/Intent; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 2727 */
(( android.content.Intent ) p0 ).getAction ( ); // invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
/* .line 2728 */
/* .local v0, "action":Ljava/lang/String; */
final String v1 = "com.wiyun.hsup.DOWNLOAD_APP"; // const-string v1, "com.wiyun.hsup.DOWNLOAD_APP"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 2729 */
com.wiyun.engine.nodes.d .g ( p0 );
/* .line 2740 */
} // :cond_0
} // :goto_0
final String v1 = "clicked"; // const-string v1, "clicked"
final String v2 = ""; // const-string v2, ""
com.wiyun.engine.nodes.d .a ( v1,v2 );
/* .line 2741 */
return;
/* .line 2730 */
} // :cond_1
final String v1 = "com.wiyun.hsup.FORWARD_INTENT"; // const-string v1, "com.wiyun.hsup.FORWARD_INTENT"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 2731 */
com.wiyun.engine.nodes.d .f ( p0 );
/* .line 2732 */
} // :cond_2
final String v1 = "com.wiyun.hsup.DOWNLOAD_OR_FORWARD"; // const-string v1, "com.wiyun.hsup.DOWNLOAD_OR_FORWARD"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 2733 */
com.wiyun.engine.nodes.d .e ( p0 );
/* .line 2734 */
} // :cond_3
final String v1 = "com.wiyun.hsup.SHOW_MINISITE"; // const-string v1, "com.wiyun.hsup.SHOW_MINISITE"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2735 */
final String v1 = "notice_id"; // const-string v1, "notice_id"
(( android.content.Intent ) p0 ).getStringExtra ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
com.wiyun.engine.nodes.d .b ( v1 );
/* .line 2736 */
v1 = com.wiyun.engine.nodes.d.t;
v2 = com.wiyun.engine.nodes.d.t;
/* const/16 v3, 0x70 */
android.os.Message .obtain ( v2,v3,p0 );
(( android.os.Handler ) v1 ).sendMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
} // .end method
private static void d ( java.lang.String p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 1921 */
v0 = com.wiyun.engine.nodes.d.m;
/* if-nez v0, :cond_0 */
/* .line 1922 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ".wiyun/winotice/"; // const-string v3, ".wiyun/winotice/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.wiyun.engine.nodes.d.i;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1923 */
} // :cond_0
v0 = com.wiyun.engine.nodes.d.m;
com.wiyun.engine.nodes._U .c ( p0 );
com.wiyun.engine.nodes._U .a ( v0,v1 );
/* .line 1924 */
return;
} // .end method
static Boolean d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 3135 */
android.net.Proxy .getDefaultHost ( );
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
static org.apache.http.HttpHost e ( ) {
/* .locals 3 */
/* .prologue */
/* .line 3142 */
/* new-instance v0, Lorg/apache/http/HttpHost; */
android.net.Proxy .getDefaultHost ( );
v2 = android.net.Proxy .getDefaultPort ( );
/* invoke-direct {v0, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V */
} // .end method
private static org.json.JSONObject e ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 3091 */
final String v0 = "["; // const-string v0, "["
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3092 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 3093 */
final String v0 = "{\"items\":"; // const-string v0, "{\"items\":"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3094 */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3095 */
/* const/16 v0, 0x7d */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 3096 */
/* new-instance v0, Lorg/json/JSONObject; */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 3098 */
} // :goto_0
} // :cond_0
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
} // .end method
private static void e ( android.content.Intent p0 ) {
/* .locals 9 */
/* .param p0, "intent" # Landroid/content/Intent; */
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
int v7 = 0; // const/4 v7, 0x0
/* .line 2745 */
final String v8 = "app_pkg"; // const-string v8, "app_pkg"
(( android.content.Intent ) p0 ).getStringExtra ( v8 ); // invoke-virtual {p0, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2746 */
/* .local v0, "appPkg":Ljava/lang/String; */
final String v8 = "app_version"; // const-string v8, "app_version"
(( android.content.Intent ) p0 ).getStringExtra ( v8 ); // invoke-virtual {p0, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2749 */
/* .local v1, "appVer":Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
/* .line 2750 */
/* .local v2, "installed":Z */
int v3 = 0; // const/4 v3, 0x0
/* .line 2751 */
/* .local v3, "obsoleted":Z */
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v8 ).getPackageManager ( ); // invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 2753 */
/* .local v5, "pm":Landroid/content/pm/PackageManager; */
int v8 = 0; // const/4 v8, 0x0
try { // :try_start_0
(( android.content.pm.PackageManager ) v5 ).getPackageInfo ( v0, v8 ); // invoke-virtual {v5, v0, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 2754 */
/* .local v4, "pi":Landroid/content/pm/PackageInfo; */
if ( v4 != null) { // if-eqz v4, :cond_0
/* move v2, v6 */
/* .line 2755 */
} // :goto_0
v8 = this.versionName;
com.wiyun.engine.nodes._U .a ( v1,v8 );
/* :try_end_0 */
v8 = /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-lez v8, :cond_1 */
/* move v3, v6 */
/* .line 2761 */
} // .end local v4 # "pi":Landroid/content/pm/PackageInfo;
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* if-nez v3, :cond_2 */
/* .line 2762 */
com.wiyun.engine.nodes.d .f ( p0 );
/* .line 2766 */
} // :goto_2
return;
/* .restart local v4 # "pi":Landroid/content/pm/PackageInfo; */
} // :cond_0
/* move v2, v7 */
/* .line 2754 */
} // :cond_1
/* move v3, v7 */
/* .line 2755 */
/* .line 2764 */
} // .end local v4 # "pi":Landroid/content/pm/PackageInfo;
} // :cond_2
com.wiyun.engine.nodes.d .g ( p0 );
/* .line 2756 */
/* :catch_0 */
/* move-exception v6 */
} // .end method
static java.util.List f ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1573 */
v0 = com.wiyun.engine.nodes.d.d;
} // .end method
private static void f ( android.content.Intent p0 ) {
/* .locals 11 */
/* .prologue */
/* .line 2769 */
final String v0 = "intent_action"; // const-string v0, "intent_action"
(( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2770 */
final String v0 = "notice_id"; // const-string v0, "notice_id"
(( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2771 */
final String v0 = "intent_category"; // const-string v0, "intent_category"
(( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2772 */
final String v0 = "intent_package"; // const-string v0, "intent_package"
(( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2773 */
final String v0 = "intent_class"; // const-string v0, "intent_class"
(( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2774 */
final String v0 = "intent_extra"; // const-string v0, "intent_extra"
(( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2775 */
final String v0 = "data_uri"; // const-string v0, "data_uri"
(( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2776 */
final String v0 = "data_type"; // const-string v0, "data_type"
(( android.content.Intent ) p0 ).getStringExtra ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2780 */
try { // :try_start_0
final String v0 = "ACTION_"; // const-string v0, "ACTION_"
v0 = (( java.lang.String ) v2 ).startsWith ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2781 */
/* const-class v0, Landroid/content/Intent; */
(( java.lang.Class ) v0 ).getField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2782 */
int v9 = 0; // const/4 v9, 0x0
(( java.lang.reflect.Field ) v0 ).get ( v9 ); // invoke-virtual {v0, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* move-object v2, v0 */
/* .line 2785 */
} // :cond_0
final String v0 = "CATEGORY_"; // const-string v0, "CATEGORY_"
v0 = (( java.lang.String ) v1 ).startsWith ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 2786 */
/* const-class v0, Landroid/content/Intent; */
(( java.lang.Class ) v0 ).getField ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 2787 */
int v9 = 0; // const/4 v9, 0x0
(( java.lang.reflect.Field ) v0 ).get ( v9 ); // invoke-virtual {v0, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v1, v2 */
/* .line 2793 */
} // :goto_0
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 2794 */
/* const/high16 v1, 0x10000000 */
(( android.content.Intent ) v2 ).addFlags ( v1 ); // invoke-virtual {v2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 2795 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_1 */
/* .line 2796 */
(( android.content.Intent ) v2 ).addCategory ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2797 */
} // :cond_1
v0 = android.text.TextUtils .isEmpty ( v4 );
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = android.text.TextUtils .isEmpty ( v5 );
/* if-nez v0, :cond_8 */
/* .line 2798 */
} // :cond_2
(( android.content.Intent ) v2 ).setClassName ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 2802 */
} // :cond_3
} // :goto_1
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 2804 */
try { // :try_start_1
/* new-instance v1, Lorg/json/JSONObject; */
/* invoke-direct {v1, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 2805 */
(( org.json.JSONObject ) v1 ).keys ( ); // invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
/* .line 2806 */
} // :cond_4
} // :goto_2
/* :try_end_1 */
v0 = /* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_1 */
/* if-nez v0, :cond_9 */
/* .line 2815 */
} // :cond_5
} // :goto_3
v0 = android.text.TextUtils .isEmpty ( v7 );
/* if-nez v0, :cond_6 */
/* .line 2816 */
android.net.Uri .parse ( v7 );
(( android.content.Intent ) v2 ).setData ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 2817 */
} // :cond_6
v0 = android.text.TextUtils .isEmpty ( v8 );
/* if-nez v0, :cond_7 */
/* .line 2818 */
(( android.content.Intent ) v2 ).setType ( v8 ); // invoke-virtual {v2, v8}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2822 */
} // :cond_7
try { // :try_start_2
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v0 ).startActivity ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_2 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/lang/SecurityException; {:try_start_2 ..:try_end_2} :catch_4 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_3 */
/* .line 2834 */
} // :goto_4
com.wiyun.engine.nodes.d .b ( v3 );
/* .line 2835 */
return;
/* .line 2789 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v0, v2 */
/* move-object v10, v1 */
/* move-object v1, v0 */
/* move-object v0, v10 */
/* .line 2799 */
} // :cond_8
v0 = android.text.TextUtils .isEmpty ( v4 );
/* if-nez v0, :cond_3 */
/* .line 2800 */
(( android.content.Intent ) v2 ).setPackage ( v4 ); // invoke-virtual {v2, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 2807 */
} // :cond_9
try { // :try_start_3
/* check-cast v0, Ljava/lang/String; */
/* .line 2808 */
(( org.json.JSONObject ) v1 ).optString ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 2809 */
v6 = android.text.TextUtils .isEmpty ( v5 );
/* if-nez v6, :cond_4 */
/* .line 2810 */
(( android.content.Intent ) v2 ).putExtra ( v0, v5 ); // invoke-virtual {v2, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* :try_end_3 */
/* .catch Lorg/json/JSONException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .line 2812 */
/* :catch_1 */
/* move-exception v0 */
/* .line 2823 */
/* :catch_2 */
/* move-exception v0 */
/* .line 2824 */
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v0 ).sendBroadcast ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
/* .line 2828 */
/* :catch_3 */
/* move-exception v0 */
/* .line 2825 */
/* :catch_4 */
/* move-exception v0 */
} // :cond_a
/* move-object v0, v1 */
/* move-object v1, v2 */
/* goto/16 :goto_0 */
} // .end method
private static void g ( android.content.Intent p0 ) {
/* .locals 13 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 2839 */
final String v2 = "app_pkg"; // const-string v2, "app_pkg"
(( android.content.Intent ) p0 ).getStringExtra ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2840 */
final String v2 = "app_name"; // const-string v2, "app_name"
(( android.content.Intent ) p0 ).getStringExtra ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2841 */
final String v2 = "app_url"; // const-string v2, "app_url"
(( android.content.Intent ) p0 ).getStringExtra ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2842 */
final String v2 = "app_version"; // const-string v2, "app_version"
(( android.content.Intent ) p0 ).getStringExtra ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2843 */
final String v2 = "notice_id"; // const-string v2, "notice_id"
(( android.content.Intent ) p0 ).getStringExtra ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 2848 */
com.wiyun.engine.nodes.f .m ( );
(( android.content.Context ) v2 ).getPackageManager ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 2850 */
int v9 = 0; // const/4 v9, 0x0
try { // :try_start_0
(( android.content.pm.PackageManager ) v2 ).getPackageInfo ( v4, v9 ); // invoke-virtual {v2, v4, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 2851 */
if ( v9 != null) { // if-eqz v9, :cond_1
/* move v2, v0 */
/* .line 2852 */
} // :goto_0
try { // :try_start_1
v9 = this.versionName;
com.wiyun.engine.nodes._U .a ( v7,v9 );
/* :try_end_1 */
v7 = /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 ..:try_end_1} :catch_7 */
/* if-lez v7, :cond_2 */
/* .line 2857 */
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_3
/* if-nez v0, :cond_3 */
/* .line 2858 */
com.wiyun.engine.nodes.d .b ( v4,p0 );
/* .line 2937 */
} // :cond_0
} // :goto_2
return;
} // :cond_1
/* move v2, v1 */
/* .line 2851 */
} // :cond_2
/* move v0, v1 */
/* .line 2852 */
/* .line 2853 */
/* :catch_0 */
/* move-exception v0 */
/* move v0, v1 */
} // :goto_3
/* move v2, v0 */
/* move v0, v1 */
/* .line 2861 */
} // :cond_3
/* new-instance v0, Lcom/wiyun/engine/nodes/d$a; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/d$a;-><init>()V */
/* .line 2862 */
this.a = v4;
/* .line 2863 */
this.b = p0;
/* .line 2864 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v9 */
/* iput-wide v9, v0, Lcom/wiyun/engine/nodes/d$a;->c:J */
/* .line 2865 */
v2 = com.wiyun.engine.nodes.d.d;
/* .line 2870 */
com.wiyun.engine.nodes._U .md5 ( v5 );
/* .line 2871 */
/* new-instance v7, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v9 = ".wiyun/winotice/"; // const-string v9, ".wiyun/winotice/"
/* invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ".apk"; // const-string v4, ".apk"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v7, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 2873 */
try { // :try_start_2
v0 = (( java.io.File ) v7 ).exists ( ); // invoke-virtual {v7}, Ljava/io/File;->exists()Z
/* if-nez v0, :cond_f */
/* .line 2875 */
/* const v0, 0xf4240 */
/* .line 2876 */
int v2 = 0; // const/4 v2, 0x0
com.wiyun.engine.nodes.d .a ( v8,v6,v0,v2 );
/* .line 2879 */
com.wiyun.engine.nodes.d .c ( );
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 2880 */
try { // :try_start_3
/* new-instance v4, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v4, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 2881 */
(( org.apache.http.impl.client.DefaultHttpClient ) v2 ).execute ( v4 ); // invoke-virtual {v2, v4}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
v5 = /* .line 2882 */
/* .line 2883 */
/* const/16 v9, 0x12c */
/* if-ge v5, v9, :cond_4 */
/* .line 2885 */
final String v5 = "Content-Length"; // const-string v5, "Content-Length"
/* .line 2886 */
if ( v5 != null) { // if-eqz v5, :cond_e
/* .line 2887 */
v0 = com.wiyun.engine.nodes._U .a ( v0 );
/* move v5, v0 */
/* .line 2892 */
} // :goto_4
/* const/16 v0, 0x1000 */
/* new-array v9, v0, [B */
/* .line 2893 */
/* .line 2894 */
/* .line 2895 */
/* new-instance v0, Ljava/io/FileOutputStream; */
/* invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_5 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* move v3, v1 */
/* move v4, v1 */
/* .line 2896 */
} // :goto_5
int v11 = -1; // const/4 v11, -0x1
/* if-ne v3, v11, :cond_7 */
/* .line 2906 */
try { // :try_start_4
(( java.io.FileOutputStream ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/FileOutputStream;->flush()V
/* .line 2909 */
final String v1 = "downloaded"; // const-string v1, "downloaded"
final String v3 = ""; // const-string v3, ""
com.wiyun.engine.nodes.d .a ( v1,v3 );
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_6 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
/* move-object v3, v0 */
/* .line 2915 */
} // :cond_4
} // :goto_6
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 2916 */
(( org.apache.http.impl.client.DefaultHttpClient ) v2 ).getConnectionManager ( ); // invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* .line 2918 */
} // :cond_5
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 2920 */
try { // :try_start_5
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_4 */
/* .line 2927 */
} // :cond_6
} // :goto_7
com.wiyun.engine.nodes.d .b ( v8 );
/* .line 2930 */
v0 = com.wiyun.engine.nodes.d.b;
/* .line 2933 */
v0 = (( java.io.File ) v7 ).exists ( ); // invoke-virtual {v7}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2934 */
com.wiyun.engine.nodes.d .a ( v7 );
/* goto/16 :goto_2 */
/* .line 2897 */
} // :cond_7
int v11 = 0; // const/4 v11, 0x0
try { // :try_start_6
(( java.io.FileOutputStream ) v0 ).write ( v9, v11, v3 ); // invoke-virtual {v0, v9, v11, v3}, Ljava/io/FileOutputStream;->write([BII)V
/* .line 2898 */
/* add-int/2addr v3, v4 */
/* .line 2899 */
/* sub-int v4, v3, v1 */
/* const v11, 0x186a0 */
/* if-le v4, v11, :cond_8 */
/* .line 2901 */
com.wiyun.engine.nodes.d .a ( v8,v6,v5,v3 );
/* move v1, v3 */
/* .line 2896 */
} // :cond_8
(( java.io.InputStream ) v10 ).read ( v9 ); // invoke-virtual {v10, v9}, Ljava/io/InputStream;->read([B)I
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_6 */
v4 = /* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
/* move v12, v4 */
/* move v4, v3 */
/* move v3, v12 */
/* .line 2912 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v0, v3 */
/* .line 2913 */
} // :goto_8
try { // :try_start_7
(( java.io.File ) v7 ).delete ( ); // invoke-virtual {v7}, Ljava/io/File;->delete()Z
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
/* .line 2915 */
if ( v3 != null) { // if-eqz v3, :cond_9
/* .line 2916 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).getConnectionManager ( ); // invoke-virtual {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* .line 2918 */
} // :cond_9
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 2920 */
try { // :try_start_8
(( java.io.FileOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
/* :try_end_8 */
/* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_2 */
/* .line 2927 */
} // :cond_a
} // :goto_9
com.wiyun.engine.nodes.d .b ( v8 );
/* .line 2930 */
v0 = com.wiyun.engine.nodes.d.b;
/* .line 2933 */
v0 = (( java.io.File ) v7 ).exists ( ); // invoke-virtual {v7}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2934 */
com.wiyun.engine.nodes.d .a ( v7 );
/* goto/16 :goto_2 */
/* .line 2914 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v2, v3 */
/* .line 2915 */
} // :goto_a
if ( v2 != null) { // if-eqz v2, :cond_b
/* .line 2916 */
(( org.apache.http.impl.client.DefaultHttpClient ) v2 ).getConnectionManager ( ); // invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* .line 2918 */
} // :cond_b
if ( v3 != null) { // if-eqz v3, :cond_c
/* .line 2920 */
try { // :try_start_9
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_3 */
/* .line 2927 */
} // :cond_c
} // :goto_b
com.wiyun.engine.nodes.d .b ( v8 );
/* .line 2930 */
v1 = com.wiyun.engine.nodes.d.b;
/* .line 2933 */
v1 = (( java.io.File ) v7 ).exists ( ); // invoke-virtual {v7}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 2934 */
com.wiyun.engine.nodes.d .a ( v7 );
/* .line 2935 */
} // :cond_d
/* throw v0 */
/* .line 2922 */
/* :catch_2 */
/* move-exception v0 */
/* :catch_3 */
/* move-exception v1 */
/* :catch_4 */
/* move-exception v0 */
/* .line 2914 */
/* :catchall_1 */
/* move-exception v0 */
/* :catchall_2 */
/* move-exception v1 */
/* move-object v3, v0 */
/* move-object v0, v1 */
/* :catchall_3 */
/* move-exception v1 */
/* move-object v2, v3 */
/* move-object v3, v0 */
/* move-object v0, v1 */
/* .line 2912 */
/* :catch_5 */
/* move-exception v0 */
/* move-object v0, v3 */
/* move-object v3, v2 */
/* :catch_6 */
/* move-exception v1 */
/* move-object v3, v2 */
/* .line 2853 */
/* :catch_7 */
/* move-exception v0 */
/* move v0, v2 */
/* goto/16 :goto_3 */
} // :cond_e
/* move v5, v0 */
/* goto/16 :goto_4 */
} // :cond_f
/* move-object v2, v3 */
/* goto/16 :goto_6 */
} // .end method
static Boolean g ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 2264 */
v0 = com.wiyun.engine.nodes.d .o ( );
} // .end method
static java.util.List h ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 2157 */
com.wiyun.engine.nodes.d .n ( );
} // .end method
static java.lang.String i ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1687 */
v0 = com.wiyun.engine.nodes.d.e;
} // .end method
private static Long j ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1847 */
v0 = com.wiyun.engine.nodes.d.j;
/* if-nez v0, :cond_0 */
/* .line 1848 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ".wiyun/winotice/"; // const-string v3, ".wiyun/winotice/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.wiyun.engine.nodes.d.f;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1849 */
} // :cond_0
v0 = com.wiyun.engine.nodes.d.j;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1850 */
v0 = com.wiyun.engine.nodes.d.j;
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 1851 */
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 1852 */
com.wiyun.engine.nodes._U .b ( v0 );
/* move-result-wide v0 */
/* .line 1854 */
} // :goto_0
/* return-wide v0 */
} // :cond_1
/* const-wide/16 v0, 0x0 */
} // .end method
private static Long k ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1866 */
v0 = com.wiyun.engine.nodes.d.k;
/* if-nez v0, :cond_0 */
/* .line 1867 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ".wiyun/winotice/"; // const-string v3, ".wiyun/winotice/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.wiyun.engine.nodes.d.g;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1868 */
} // :cond_0
v0 = com.wiyun.engine.nodes.d.k;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1869 */
v0 = com.wiyun.engine.nodes.d.k;
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 1870 */
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 1871 */
com.wiyun.engine.nodes._U .b ( v0 );
/* move-result-wide v0 */
/* .line 1873 */
} // :goto_0
/* return-wide v0 */
} // :cond_1
/* const-wide/16 v0, 0x0 */
} // .end method
private static Long l ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1885 */
v0 = com.wiyun.engine.nodes.d.l;
/* if-nez v0, :cond_0 */
/* .line 1886 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ".wiyun/winotice/"; // const-string v3, ".wiyun/winotice/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.wiyun.engine.nodes.d.h;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1887 */
} // :cond_0
v0 = com.wiyun.engine.nodes.d.l;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1888 */
v0 = com.wiyun.engine.nodes.d.l;
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 1889 */
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 1890 */
com.wiyun.engine.nodes._U .b ( v0 );
/* move-result-wide v0 */
/* .line 1892 */
} // :goto_0
/* return-wide v0 */
} // :cond_1
/* const-wide/32 v0, 0x927c0 */
} // .end method
private static java.lang.String m ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1904 */
try { // :try_start_0
v0 = com.wiyun.engine.nodes.d.m;
/* if-nez v0, :cond_0 */
/* .line 1905 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ".wiyun/winotice/"; // const-string v3, ".wiyun/winotice/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.wiyun.engine.nodes.d.i;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1906 */
} // :cond_0
v0 = com.wiyun.engine.nodes.d.m;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1907 */
v0 = com.wiyun.engine.nodes.d.m;
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 1908 */
com.wiyun.engine.nodes._U .a ( v0 );
/* .line 1909 */
com.wiyun.engine.nodes.d .e ( v0 );
/* .line 1910 */
final String v1 = "items"; // const-string v1, "items"
(( org.json.JSONObject ) v0 ).optJSONArray ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 1911 */
v1 = (( org.json.JSONArray ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
/* .line 1912 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* long-to-int v2, v2 */
/* rem-int v1, v2, v1 */
(( org.json.JSONArray ) v0 ).optString ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1917 */
} // :goto_0
/* .line 1914 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1917 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static java.util.List n ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/http/NameValuePair;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 2158 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2161 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "device_id"; // const-string v2, "device_id"
com.wiyun.engine.nodes.f .h ( );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2164 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "app_key"; // const-string v2, "app_key"
com.wiyun.engine.nodes.f .g ( );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2167 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "sdk_name"; // const-string v2, "sdk_name"
final String v3 = "WiEngine"; // const-string v3, "WiEngine"
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2170 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "os"; // const-string v2, "os"
final String v3 = "Android"; // const-string v3, "Android"
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2173 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "os_version"; // const-string v2, "os_version"
v3 = com.wiyun.engine.nodes.f .j ( );
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2176 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "lat"; // const-string v2, "lat"
com.wiyun.engine.nodes.f .o ( );
/* move-result-wide v3 */
java.lang.String .valueOf ( v3,v4 );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2179 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "lon"; // const-string v2, "lon"
com.wiyun.engine.nodes.f .p ( );
/* move-result-wide v3 */
java.lang.String .valueOf ( v3,v4 );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2182 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "brand"; // const-string v2, "brand"
com.wiyun.engine.nodes.f .d ( );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2185 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "model"; // const-string v2, "model"
com.wiyun.engine.nodes.f .e ( );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2188 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "lan"; // const-string v2, "lan"
com.wiyun.engine.nodes.f .k ( );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2191 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "country"; // const-string v2, "country"
com.wiyun.engine.nodes.f .l ( );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2194 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "network"; // const-string v2, "network"
v3 = com.wiyun.engine.nodes.f .f ( );
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2197 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "pkg"; // const-string v2, "pkg"
com.wiyun.engine.nodes.f .q ( );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2200 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "screen_width"; // const-string v2, "screen_width"
v3 = com.wiyun.engine.nodes.f .a ( );
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2203 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "screen_height"; // const-string v2, "screen_height"
v3 = com.wiyun.engine.nodes.f .b ( );
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2206 */
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
final String v2 = "screen_dpi"; // const-string v2, "screen_dpi"
v3 = com.wiyun.engine.nodes.f .c ( );
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 2208 */
} // .end method
private static Boolean o ( ) {
/* .locals 12 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v2 = 0; // const/4 v2, 0x0
/* const/16 v10, 0x12c */
/* .line 2266 */
com.wiyun.engine.nodes.d .c ( );
/* .line 2270 */
try { // :try_start_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* .line 2271 */
com.wiyun.engine.nodes.d .k ( );
/* move-result-wide v6 */
/* sub-long v6, v4, v6 */
/* const-wide/32 v8, 0x240c8400 */
/* cmp-long v1, v6, v8 */
/* if-lez v1, :cond_0 */
/* .line 2273 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2274 */
final String v6 = "http://n.wiyun.com/hsup/spi"; // const-string v6, "http://n.wiyun.com/hsup/spi"
(( java.lang.StringBuilder ) v1 ).append ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2277 */
com.wiyun.engine.nodes.d .a ( v1 );
/* .line 2287 */
/* new-instance v6, Lorg/apache/http/client/methods/HttpGet; */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v6, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 2288 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).execute ( v6 ); // invoke-virtual {v3, v6}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
v6 = /* .line 2289 */
/* .line 2293 */
/* if-ge v6, v10, :cond_0 */
/* .line 2299 */
com.wiyun.engine.nodes.d .a ( v1 );
/* .line 2306 */
com.wiyun.engine.nodes.d .d ( v1 );
/* .line 2309 */
com.wiyun.engine.nodes.d .b ( v4,v5 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_3 */
/* .line 2317 */
} // :cond_0
} // :goto_0
try { // :try_start_1
com.wiyun.engine.nodes.d .m ( );
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 2328 */
} // :goto_1
try { // :try_start_2
v1 = com.wiyun.engine.nodes.d.e;
android.text.TextUtils .isEmpty ( v1 );
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
v1 = /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 2413 */
v0 = com.wiyun.engine.nodes.d.a;
com.wiyun.engine.nodes.e .b ( v0 );
/* .line 2430 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 2431 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).getConnectionManager ( ); // invoke-virtual {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* .line 2434 */
} // :cond_1
} // :goto_2
/* .line 2332 */
} // :cond_2
try { // :try_start_3
v1 = com.wiyun.engine.nodes.d.e;
final String v4 = "http"; // const-string v4, "http"
v1 = (( java.lang.String ) v1 ).startsWith ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v1, :cond_3 */
/* .line 2333 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v4 = "http://"; // const-string v4, "http://"
/* invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = com.wiyun.engine.nodes.d.e;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 2336 */
} // :cond_3
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2337 */
v1 = com.wiyun.engine.nodes.d.e;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2340 */
com.wiyun.engine.nodes.d .a ( v4 );
/* .line 2343 */
final String v5 = "support_shortcut"; // const-string v5, "support_shortcut"
/* .line 2344 */
com.wiyun.engine.nodes.f .m ( );
final String v6 = "com.android.launcher.permission.INSTALL_SHORTCUT"; // const-string v6, "com.android.launcher.permission.INSTALL_SHORTCUT"
v1 = (( android.content.Context ) v1 ).checkCallingOrSelfPermission ( v6 ); // invoke-virtual {v1, v6}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v1, :cond_7 */
final String v1 = "true"; // const-string v1, "true"
/* .line 2343 */
} // :goto_3
com.wiyun.engine.nodes.d .b ( v4,v5,v1 );
/* .line 2350 */
/* new-instance v1, Lorg/apache/http/client/methods/HttpGet; */
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v4}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 2351 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).execute ( v1 ); // invoke-virtual {v3, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
v4 = /* .line 2352 */
/* .line 2356 */
/* if-ge v4, v10, :cond_b */
/* .line 2362 */
com.wiyun.engine.nodes.d .a ( v0 );
/* .line 2368 */
com.wiyun.engine.nodes.d .e ( v0 );
/* .line 2369 */
com.wiyun.engine.nodes.d$b .a ( v0 );
/* .line 2372 */
v0 = this.c;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_4 */
/* .line 2373 */
/* new-instance v0, Lorg/apache/http/client/methods/HttpGet; */
v4 = this.c;
/* invoke-direct {v0, v4}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 2374 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).execute ( v0 ); // invoke-virtual {v3, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
v4 = /* .line 2375 */
/* .line 2376 */
/* if-ge v4, v10, :cond_4 */
/* .line 2377 */
com.wiyun.engine.nodes.d .b ( v0 );
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 2378 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 2380 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_4
/* array-length v5, v0 */
android.graphics.BitmapFactory .decodeByteArray ( v0,v4,v5 );
this.j = v0;
/* .line 2381 */
v0 = com.wiyun.engine.nodes.d.b;
v4 = this.a;
v5 = this.j;
/* .line 2382 */
int v0 = 0; // const/4 v0, 0x0
/* check-cast v0, [B */
/* :try_end_4 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 2395 */
} // :cond_4
} // :goto_4
try { // :try_start_5
/* iget v0, v1, Lcom/wiyun/engine/nodes/d$b;->f:I */
/* if-lez v0, :cond_8 */
/* .line 2396 */
v0 = com.wiyun.engine.nodes.d.t;
/* const/16 v4, 0x6f */
android.os.Message .obtain ( v0,v4,v1 );
/* .line 2397 */
v4 = com.wiyun.engine.nodes.d.t;
/* iget v5, v1, Lcom/wiyun/engine/nodes/d$b;->f:I */
/* int-to-long v5, v5 */
(( android.os.Handler ) v4 ).sendMessageDelayed ( v0, v5, v6 ); // invoke-virtual {v4, v0, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_0 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 2398 */
int v0 = 1; // const/4 v0, 0x1
/* move-object v11, v1 */
/* move v1, v0 */
/* move-object v0, v11 */
/* .line 2413 */
} // :goto_5
v2 = com.wiyun.engine.nodes.d.a;
com.wiyun.engine.nodes.e .b ( v2 );
/* .line 2416 */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 2417 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
com.wiyun.engine.nodes.d .a ( v4,v5 );
/* .line 2420 */
if ( v0 != null) { // if-eqz v0, :cond_5
/* iget v2, v0, Lcom/wiyun/engine/nodes/d$b;->g:I */
/* if-lez v2, :cond_5 */
/* .line 2421 */
/* iget v0, v0, Lcom/wiyun/engine/nodes/d$b;->g:I */
/* int-to-long v4, v0 */
com.wiyun.engine.nodes.d .c ( v4,v5 );
/* .line 2430 */
} // :cond_5
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 2431 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).getConnectionManager ( ); // invoke-virtual {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
} // :cond_6
} // :goto_6
/* move v2, v1 */
/* .line 2434 */
/* goto/16 :goto_2 */
/* .line 2344 */
} // :cond_7
try { // :try_start_6
final String v1 = "false"; // const-string v1, "false"
/* goto/16 :goto_3 */
/* .line 2400 */
} // :cond_8
com.wiyun.engine.nodes.d .b ( v1 );
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_0 */
v0 = /* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* move-object v11, v1 */
/* move v1, v0 */
/* move-object v0, v11 */
/* .line 2409 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2413 */
v0 = com.wiyun.engine.nodes.d.a;
com.wiyun.engine.nodes.e .b ( v0 );
/* .line 2430 */
if ( v3 != null) { // if-eqz v3, :cond_a
/* .line 2431 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).getConnectionManager ( ); // invoke-virtual {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* move v1, v2 */
/* .line 2412 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 2413 */
v1 = com.wiyun.engine.nodes.d.a;
com.wiyun.engine.nodes.e .b ( v1 );
/* .line 2430 */
if ( v3 != null) { // if-eqz v3, :cond_9
/* .line 2431 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).getConnectionManager ( ); // invoke-virtual {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* .line 2432 */
} // :cond_9
/* throw v0 */
/* .line 2387 */
/* :catch_1 */
/* move-exception v0 */
/* .line 2318 */
/* :catch_2 */
/* move-exception v1 */
/* goto/16 :goto_1 */
/* .line 2312 */
/* :catch_3 */
/* move-exception v1 */
/* goto/16 :goto_0 */
} // :cond_a
/* move v1, v2 */
} // :cond_b
/* move v1, v2 */
} // .end method
