import "./featuredInfo.css";
import { ArrowDownward, ArrowUpward } from "@material-ui/icons";

export default function FeaturedInfo() {
  return (
    <div className="featured">
      <div className="featuredItem">
        <span className="featuredTitle">Articles</span>
        <div className="featuredMoneyContainer">
          <span className="featuredMoney">$2,415</span>

        </div>
        <span className="featuredSub">Compared to last month</span>
      </div>
      <div className="featuredItem">
        <span className="featuredTitle">Devoirs</span>
        <div className="featuredMoneyContainer">
          <span className="featuredMoney">$4,415</span>

        </div>
        <span className="featuredSub">Compared to last month</span>
      </div>
      <div className="featuredItem">
        <span className="featuredTitle">Events</span>
        <div className="featuredMoneyContainer">
          <span className="featuredMoney">$2,225</span>

        </div>
        <span className="featuredSub">Compared to last month</span>
      </div>
      <div className="featuredItem">
        <span className="featuredTitle">Cours</span>
        <div className="featuredMoneyContainer">
          <span className="featuredMoney">$2,225</span>

        </div>
        <span className="featuredSub">Compared to last month</span>
      </div>
    </div>
  );
}
