package myApp.client.vi.home.entrust;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Image;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.core.client.XTemplates.XTemplate;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutData;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutPack;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.HBoxLayoutAlign;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HtmlLayoutContainer;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer.VBoxLayoutAlign;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.info.Info;

import myApp.client.resource.ResourceIcon;
import myApp.client.vi.home.product.SmartPrivateBond.HTMLTemplate;

public class EntrustInvestment extends  ContentPanel {

	public interface HTMLTemplate extends XTemplates {
		//웹에디터 HTML 설정
		@XTemplate(source="invest.html")
		SafeHtml getTemplate();
	}
	
		public EntrustInvestment() {

			this.setHeaderVisible(false);

			VBoxLayoutContainer gridVBox = new VBoxLayoutContainer();
			gridVBox.setVBoxLayoutAlign(VBoxLayoutAlign.LEFT);
			gridVBox.setWidth(800);
			gridVBox.setHeight(1000);


//			HTML mapImage = new HTML("<img src='img/org_bg.jpg' width='656' height='440'>"); //조직도
			
			Image lineBar0 = new Image(ResourceIcon.INSTANCE.lineBar());
			gridVBox.add(lineBar0,new BoxLayoutData(new Margins(0, 0, 0, 0)));

			VBoxLayoutContainer rightVBox = new VBoxLayoutContainer();
			rightVBox.setVBoxLayoutAlign(VBoxLayoutAlign.LEFT);
			
			HTMLTemplate htmlTemplate = GWT.create(HTMLTemplate.class);
			HtmlLayoutContainer content = new HtmlLayoutContainer(htmlTemplate.getTemplate());

			HBoxLayoutContainer totalHBar = new HBoxLayoutContainer();
			totalHBar.setHBoxLayoutAlign(HBoxLayoutAlign.TOP);
			totalHBar.add(content, new BoxLayoutData(new Margins(20, 0, 5, 45)));

//			gridVBox.add(MainFramePage.FuncTextContents("투자일임"));
			gridVBox.add(lineBar0,new BoxLayoutData(new Margins(0, 0, 0, 40)));
//			gridVBox.add(mapImage,new BoxLayoutData(new Margins(20, 0, 0, 40)));
			gridVBox.add(totalHBar);

			this.add(gridVBox);
		}
}
