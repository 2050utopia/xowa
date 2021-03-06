/*
XOWA: the XOWA Offline Wiki Application
Copyright (C) 2012-2017 gnosygnu@gmail.com

XOWA is licensed under the terms of the General Public License (GPL) Version 3,
or alternatively under the terms of the Apache License Version 2.0.

You may use XOWA according to either of these licenses as is most appropriate
for your project on a case-by-case basis.

The terms of each license can be found in the source code repository:

GPLv3 License: https://github.com/gnosygnu/xowa/blob/master/LICENSE-GPLv3.txt
Apache License: https://github.com/gnosygnu/xowa/blob/master/LICENSE-APACHE2.txt
*/
package gplx.xowa.xtns.wbases.claims.itms; import gplx.*; import gplx.xowa.*; import gplx.xowa.xtns.*; import gplx.xowa.xtns.wbases.*; import gplx.xowa.xtns.wbases.claims.*;
import gplx.xowa.xtns.wbases.claims.enums.*;
public class Wbase_claim_monolingualtext_ {
	public static final byte
	  Tid__text									= 0
	, Tid__language								= 1
	;
	public static final    Wbase_enum_hash Reg = new Wbase_enum_hash("claim.val.monolingualtext", 2);
	public static final    Wbase_enum_itm
	  Itm__text						= Reg.Add(Tid__text			, "text")
	, Itm__language					= Reg.Add(Tid__language		, "language")
	;
}
